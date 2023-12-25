class Solution {
    public void revArr(char[] arr, int s, int e){
        int n = (e-s)/2;
        while(s<e){
            char temp = arr[s];
            arr[s] = arr[e-1];
            arr[e-1] = temp;
            e--;
            s++;
        }
    }
    public int nextGreaterElement(int n) {
        char nums[] = String.valueOf(n).toCharArray();
        int len = nums.length;

        int idx = -1;
        for(int i = len-1; i >0; i--){
            if((nums[i]-'0') >(nums[i-1]-'0')){
                idx = i-1;
                break;
            }
        }
        if(idx == -1){
            return -1;
        }
        int idx2 = -1;
        for(int i = len-1; i > idx; i--){
            if((nums[idx]-'0') < (nums[i]-'0') ){
                idx2 = i;
                break;
            }
        }

        char temp = nums[idx];
        nums[idx] = nums[idx2];
        nums[idx2] = temp;

        revArr(nums,idx+1,len);

        int ans = 0;
        int maxLimit = Integer.MAX_VALUE;
        int minLimit = Integer.MIN_VALUE;

        for(int i = 0 ; i < len; i++){
            int num = nums[i] - '0';
            if(maxLimit/10 < ans){
                return -1;
            }
            ans = ans*10 +num;
        }
        if(minLimit >= ans){
            return -1;
        }
        return ans;
    }
}