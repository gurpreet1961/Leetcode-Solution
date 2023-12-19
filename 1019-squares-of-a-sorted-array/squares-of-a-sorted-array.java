class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int s = 0; 
        int e = n-1;
        int[] ans= new int[n];
        int j = n-1;
        for(int i = 0 ; i < n; i++){
            int sq1 = nums[s]*nums[s];
            int sq2 = nums[e]*nums[e];

            if(sq1 > sq2){
                ans[j--] = sq1;
                s++;
            }else{
                ans[j--] = sq2;
                e--;
            }
        }

        return ans;
    }
}