class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length;
        int i = 0;
        int m = 0;
        int count = 0;
        for(int j = 0 ; j < n; j++){
            int a = nums[j];
            if(a>right){
                m=0;
                i = j+1;
                continue;
            }
            else if( a>=left && a<=right ){
                m = j-i+1;
            }

            count += m;
        }
        return count;
    }
}