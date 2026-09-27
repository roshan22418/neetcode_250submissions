class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low<high){
            int mid = low + (high-low)/2;
            // System.out.println(mid);
            if(nums[mid]==target){
                // System.out.println(mid);
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(index != -1 || (low != nums.length && nums[low]==target)){
            return index != -1 ? index : low;
        }
        else{
            if(low==nums.length){
                return nums.length;
            }
            else if(low==0){
                return 0;
            }
            else{
                if(nums[low]>target){
                    return low;
                }
                else{
                    return low+1;
                }
            }
        }

        
    }
}