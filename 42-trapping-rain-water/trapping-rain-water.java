class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];

        for(int i = 1, j = n-2; i < n; i++,j--){
            int curLeft = height[i];
            int curRight = height[j];

            left[i] = Math.max(curLeft, left[i-1]);
            right[j] = Math.max(curRight, right[j+1]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.min(left[i],right[i]) - height[i];
        }
        return ans;
    }
}