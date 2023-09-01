class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int s = 0;
        int e = n-1;
        int [] ans = new int[n];
        for(int i = n-1; i>=0;i--){
            if(Math.abs(nums[s])>Math.abs(nums[e])){
                ans[i] = nums[s]*nums[s];
                s++;
            }else{
                ans[i] = nums[e]*nums[e];
                e--;
            }
        }
        return ans;
    }
}