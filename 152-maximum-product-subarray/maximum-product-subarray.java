class Solution {
    public int maxProduct(int[] nums) {
        int preSum = 1;
        int max = nums[0];
        for(int i = 0 ; i < nums.length; i++){
            preSum *= nums[i];
            if(max<preSum){
                max = preSum;
            }
            if(preSum == 0){
                preSum = 1;
            }
        }
        int postSum = 1;
        for(int i =  nums.length-1; i>=0; i--){
            postSum *= nums[i];
            if(max<postSum){
                max = postSum;
            }
            if(postSum == 0){
                postSum = 1;
            }
        }
        return max;
    }
}