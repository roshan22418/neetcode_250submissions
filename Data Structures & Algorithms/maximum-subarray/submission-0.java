class Solution {
    public int maxSubArray(int[] nums) {
        int maximumAns = -1000000;
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
            temp += nums[i];
            maximumAns = Math.max(temp,maximumAns);
            if(temp<0){
                temp = 0;
            }                                                        
        }
        return maximumAns;

        
    }
}