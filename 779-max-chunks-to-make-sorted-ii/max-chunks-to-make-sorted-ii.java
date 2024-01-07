class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int dp1[] = new int[n];
        dp1[0] = arr[0];
        int dp2[] = new int[n];
        dp2[n-1] = arr[n-1];
        for(int i = 1,j=n-2 ; i < n; i++,j--){
            dp1[i] = Math.max(arr[i],dp1[i-1]);
            dp2[j] = Math.min(arr[j], dp2[j+1]);
        }
        int ans =1;
        for(int i = 0 ; i < n-1; i++){
            if(dp1[i] <=  dp2[i+1]){
                ans++;
            }
        }

        return ans;
    }
}