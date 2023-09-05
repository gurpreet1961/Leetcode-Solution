class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0;
        int n = height.length;
        int j = n-1;
        while(i<j){
            int curWater = 0;
            if(height[i]>=height[j]){
                curWater = (j-i)*height[j];
                j--;
            }else{
                curWater = (j-i)*height[i];
                i++;
            }
            ans = Math.max(ans,curWater);
        }
        return ans;
    }
}