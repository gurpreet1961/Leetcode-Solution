class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int ans = Integer.MIN_VALUE;
        while(i<j){
            int curAns = (j-i) * Math.min(height[i],height[j]);
            ans = Math.max(ans,curAns);
            if(height[i] < height[j]){
                i++;
            }else if(height[i]>=height[j]){
                j--;
            }
        }
        return ans;
    }
}