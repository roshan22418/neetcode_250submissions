class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int length1 = nums.length;
        while(j<length1){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                i++;
                j++;                
            }
        }
        return i+1;
        
    }
}