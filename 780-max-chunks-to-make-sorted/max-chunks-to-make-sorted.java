class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n= arr.length;
        if(arr[0] == n-1 || arr[n-1] == 0){
            return 1;
        }
        int ans = 0;
        int max = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            if(max == i){
                ans++;
            }
        }
        return ans;
    }
}