class Solution {
    public int maxProduct(int[] nums) {
        int prePro = 1;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++){
            prePro *= nums[i];
            if(prePro > max){
                max = prePro;
            } 
            if(prePro == 0){
                prePro = 1;
            }
            
        }
        int postPro = 1;
        for(int i = n-1; i >=0 ; i--){
            postPro *= nums[i];
             if(postPro > max){
                max = postPro;
            } 
            if(postPro == 0){
                postPro = 1;
            }
           
        }
        return max;
    }
}