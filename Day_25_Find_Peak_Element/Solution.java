class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && 
                (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }
            
            if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        return -1;
    }
}
