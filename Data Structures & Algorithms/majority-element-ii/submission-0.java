class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int firstElement = nums[0];
        if(nums.length==1){
            return List.of(firstElement);
        }
        int count2 = 1;
        int secondElement = nums[1];
        int count1 = 1;
        for(int i = 2;i<nums.length;i++){
            if(firstElement==nums[i]){
                count1++;
            }
            else if(secondElement==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
                if(count1==0){
                    count1 = 1;
                    firstElement = nums[i];
                }
                if(count2 == 0){
                    count2 = 1;
                    secondElement = nums[i]; 
                    
                }
            }
        }
            if((firstElement==secondElement) && count1 == 1&& count2 == 1){
                return List.of();

            }
            else if((firstElement==secondElement)){
                return List.of(firstElement);
            }
            else{
                return List.of(firstElement,secondElement);
            }        
        
    }
}