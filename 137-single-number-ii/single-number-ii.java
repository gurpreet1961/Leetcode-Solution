class Solution {
    public int singleNumber(int[] nums) {
       int one = 0;
       int two = 0;

       for(int ele: nums){
           one =(one^ ele) & (~two); 
           //one xor ele -> if ele not present in one than add it and & ~two and it should also present in two because then if a number which is already there for 2 time then it is coming for 3rd time.
           two = (two^ele) & (~one);
           //if val not there then add only if it is not on one because it came only one time now

       }
       return one;
       /*ex - 2223, 
                2-> one = (0^2)  = 2 & ~0 = 2 & 3 
                because in bit 2 = 1 0 and ~of 00 = 1 1
                one = 2
                two = (0^2) = 2 & ~2 
                1 0 & 0 1 = 0 0
                two = 0

                2-> one = (2^2)  //here element already present one time then its now coming 2nd time
                = 0 & ~0 = 0
                one = 0 
                two = (0^2) = 2 & ~0
                1 0 & 1 1 = 1 0
                two = 2
                
                3-> one = 0^3 = 3 
                3 & ~2 = 11 & 01 = 1
                one = 1
                two = 2^3 = 1 0 ^ 1 1 = 1 
                1 & ~1 = 0
                two = 0

                2-> one = (1^2) =  0 1 ^ 1 0 = 3
                = 3 & ~0 = 1 1 & 1 1 = 3
                one = 3

                two = (0^3) = 3 
                3 & ~3 = 0
                two = 0 

                Answer= 3
                you check check for multiple examples like 2323432414 or etc
           */
    }
}