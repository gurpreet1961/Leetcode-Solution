class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int se = 0;
        int curSubSum= 0;
        for(int i = 0 ; i <nums.length; i++){
            curSubSum += nums[i];
            if(max < curSubSum){
                max = curSubSum;
            }
            if(curSubSum < 0){
                curSubSum = 0;
            }
        }
        return max;
    }
}