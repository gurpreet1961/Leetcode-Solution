class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int count = 0;
        for(int i:nums){
            if(count ==0){
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