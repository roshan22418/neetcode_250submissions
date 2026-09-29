class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0;i<nums.length-k;i++){
            for(int j = i+1;j<=i+k;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;

                
    }
}