class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        if(arr[n-1] ==0 || arr[0] == n-1){
            return 1;
        }

        int ans = 0;
        int max = arr[0];
        for(int i = 0;i<n;i++){
            max = Math.max(arr[i],max);
            if(i == max){
                ans++;
            }
        }
        return ans;
    }
}