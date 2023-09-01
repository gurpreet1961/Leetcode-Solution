class Solution {
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        //Optimal Approch
        //inplace array changes
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            int ci = nums[i] -1;
            while(nums[i]>0 && nums[i]<=n&&nums[i] != nums[ci] ){
                swap(ci,i,nums);
                ci = nums[i] -1;
            }
        }

        for(int i = 0;i<n;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;

        //Extra Space Approch
        // Arrays.sort(nums);
        // int n = 1;
        // for(int  i = 0 ; i < nums.length; i++){
        //     if(i>0 && nums[i]==nums[i-1]){
        //         continue;
        //     }
        //     if(nums[i]>0){
        //         if(nums[i]==n){
        //             n++;
        //         }else{
        //             return n;
        //         }
        //     }
        // }
        // return n;

        //2nd Approch -> Using Extra  Space
        // int n =nums.length;
        // int frq[] = new int[n];
        // for(int i = 0 ; i < n; i++){
        //     int ele = nums[i];
        //     if(ele<=0||ele>n){
        //         continue;
        //     }
        //     frq[nums[i]-1]++;
        // }
        // for(int i = 0 ; i < n; i++){
        //     if(frq[i] == 0){
        //         return i+1;
        //     }
        // }
        // return n+1;



    }
}