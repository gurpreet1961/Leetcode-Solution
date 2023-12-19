class Solution {
    private void rev(int[] nums, int s, int e){
        int n = (s+e)/2;
        for(int i = s; i <= n ; i++){
            int temp = nums[i];
            nums[i] = nums[e];
            nums[e] = temp;
            e--;
        }

    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rev(nums,0,n-k-1);
        rev(nums, n-k, n-1);
        rev(nums,0,n-1);
    }
}