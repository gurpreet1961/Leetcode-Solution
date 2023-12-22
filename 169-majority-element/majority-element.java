class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; 
        int ans = 0;
        for(int i:  nums){
            if(count == 0){
                ans = i;
            }
            if(ans == i){
                count++;
            }else{
                count--;
            }
        }
        return ans;
    }
}