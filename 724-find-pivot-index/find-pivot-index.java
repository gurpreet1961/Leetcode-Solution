class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        /*---------------TC: O(N) and SC = O(N)-----------------------*/
        // long[] prefixSum = new long[n];
        // prefixSum[0] = arr[0];
        // for(int i =1; i<n; i++){
        //     prefixSum[i] = prefixSum[i-1] + arr[i];
        // }

        // for(int i = 1; i < n; i++){
        //     if(prefixSum[i-1] == (prefixSum[n-1]-prefixSum[i])){
        //         return i;
        //     }
        // }
        // return -1;

        /*---------------TC: O(N) and SC = O(1)-----------------------*/
        long TotalSum = 0;
        for(int i =0; i<n; i++){
            TotalSum += arr[i];
        }
        long leftSum = 0;
        for(int i = 0; i < n; i++){
            if(leftSum == (TotalSum-leftSum-arr[i])){
                return i;
            }else{
                leftSum +=arr[i];
            }
        }
        return -1;
    }
}