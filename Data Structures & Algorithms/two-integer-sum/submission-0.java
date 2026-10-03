class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int required = target-nums[i];
            if(hMap.containsKey(required)){
                return new int[]{hMap.get(required), i}; 
            }
            hMap.put(nums[i],i);
        }
        return new int[]{};

        
        
    }
}
