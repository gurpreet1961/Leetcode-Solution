class Solution {
   public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor == -1)return Integer.MAX_VALUE;
        

        int dd= Math.abs(dividend);
        int dv = Math.abs(divisor);

        int ans = 0;
        while(dd-dv>=0){
            int count = 1;
            int sum = dv;
            while(dd-(sum<<1) >=0){
                sum <<=1; //<< left shift basically do power of 2
                count <<=1;
            }

            ans += count;
            dd -= sum; 

        }
        

        return (dividend>0)==(divisor>0) ? ans : -ans;
    }
}