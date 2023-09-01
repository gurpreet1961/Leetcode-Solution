class Solution {
    public void reverse(int[] nums, int s, int e){
        int n = (s+e)/2;

        for(int i = s; i<=n; i++){
            int temp = nums[i];
            nums[i] = nums[e];
            nums[e] = temp;
            e--; 
        }
        for(int i: nums){
            
            System.out.print(i);
        }

    }
    public void rotate(int[] nums, int k) {
        int n  = nums.length;
        k = k%n;
        /*-----------Method 1---------------- */
        // while(k-->0){
        //     int temp = nums[n-1];
        //     for(int i = n-1; i>0; i--){
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = temp;
        // }

        /*-----------Method 2---------------- */
        // int arr[] = new int[k];
        // int j = 0;
        // for(int i = n-k;i<n; i++){
        //     arr[j++]  = nums[i];
        // }
        // j = n-1;
        // for(int i = n-k-1; i>=0;i--){
        //     nums[j--] = nums[i];
        // }
        // for(int i = 0 ; i < k; i++){
        //     nums[i] = arr[i];
        // }

        /*---------------Method 3------------------- */
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}