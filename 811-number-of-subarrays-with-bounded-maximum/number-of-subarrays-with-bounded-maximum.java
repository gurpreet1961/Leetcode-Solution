 class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int curCount = 0;
        int count = 0;
        while (j < n) {
            if (nums[j] > right) {
                curCount = 0;
                i = j + 1;
            } else if (nums[j] >= left) {
                curCount = j - i + 1;
            }
            count += curCount;
            j++;
        }
        return count;
    }
}