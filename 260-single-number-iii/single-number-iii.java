class Solution {
    public int[] singleNumber(int[] nums) {
        // difference between two numbers (x and y) which were seen only once
        int bitmask = 0;
        for (int num : nums) bitmask ^= num; //this will result in x^y because other number will become 0 
        int diff = bitmask & (-bitmask);  //finding the right most set bit mask
        // (-bitmask) will first invert all bit of bitmask and then add 1 to it
        /*
        Let bitmask = 10010
        then 10010 & [-10010->(01110)]  =  00010 which is right most set bitmask
        */
        /**here when ever we will do bitwise-and with ele then only the number which has this bit will as set then result will not equal to 0 so, we will take xor of that  so with which we will get  our one number */

        int x = 0;
        // bitmask which will contain only x
        for (int num : nums) if ((num & diff) != 0) x ^= num;

//when ever we will xor one number with the bitmask (which is xor of that two number) give us second number
        return new int[]{x, bitmask^x};
    }
}