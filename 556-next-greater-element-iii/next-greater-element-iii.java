class Solution {
     public void revArray(char[] nums, int s, int e){
        int n = (e-s)/2;
        while(s<e){
            char temp = nums[s];
            nums[s] = nums[e-1];
            nums[e-1] = temp;
            e--;
            s++;
        }
    }
    public int nextGreaterElement(int n) {
        char nums[] = String.valueOf(n).toCharArray();
        int len = nums.length;
        int idx1 = -1; // it store the index of first number which smaller then it next number
        for(int i = len-1; i>0; i--){
            if((nums[i]-'0')>(nums[i-1]-'0')){
                idx1 = i-1;
                break;
            }
        }
        if(idx1 == -1){
            return -1;
        }
        int idx2 = -1; // it store the just greater number from the number at idx1 from last
        for(int i = len-1; i>idx1; i--){
            if((nums[i]-'0')>(nums[idx1]-'0')){
                idx2 = i;
                break;
            }
        }
        //swaping those two number
        char temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;

      
        revArray(nums, idx1+1, len);
        int ans = 0;
        int maxLimit = Integer.MAX_VALUE;
        int minLimit = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            int num = nums[i] - '0';
            if(maxLimit/10 < ans){
                return -1;
            }
            ans = ans*10 + num;
        }
        
        if(ans<=minLimit){
            return -1;
        }
        return ans;
    }
}