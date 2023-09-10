class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int firstSmall =Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int  i = 0; i < n ; i++){
            if(nums[i] <= firstSmall  ){
                firstSmall = nums[i];
            }else if(nums[i]<=secSmall){
                secSmall = nums[i];
            }else{
                return true;
            }

        }
        return false;
    }
}