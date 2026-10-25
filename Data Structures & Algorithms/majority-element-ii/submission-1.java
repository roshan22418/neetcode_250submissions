class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int firstCandidate = 0;
        int count1 = 0;
        int count2 = 0;
        int secondCandidate = 0;
        for(int i = 0;i<nums.length;i++){
            if(firstCandidate==nums[i]){
                count1++;
            }
            else if(secondCandidate==nums[i]){
                count2++;
            }
            else if(count1 == 0){
                firstCandidate = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                secondCandidate = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==firstCandidate){
                count1++;
            }
            else if(nums[i]==secondCandidate){
                count2++;
            }
        }  
        List<Integer> ans = new ArrayList<>(); 
        int majorityElement =  nums.length/3;  
        if(count1>majorityElement){
            ans.add(firstCandidate);
        }
        if(count2>majorityElement){
            ans.add(secondCandidate);
        }
        return ans;
    }
}