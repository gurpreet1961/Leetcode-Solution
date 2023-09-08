class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int right[] = new int[n]; // store the max element from the right side
        int left[] = new int[n]; //store the max element from the left side
        right[n-1]  = height[n-1];
        left[0] = height[0];

        //Finding the largest element from left side and from right side
        for(int i =1,j = n-2;i<n;i++,j--){
            int le = height[i];

            int re = height[j];

            left[i] = Math.max(le,left[i-1]);
            right[j] = Math.max(re,right[j+1]);
        }

        //comparing the value of both max height at i index and take minimum one and exclude current height
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.min(left[i],right[i]) - height[i];
        }

        return ans;
    }
}