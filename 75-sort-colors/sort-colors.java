class Solution {
    public void sortColors(int[] nums) {
         /*
        take 3 ptr for left(0-red), mid(1-white), right(2-blue)
        check mid element
        if mid = 0 then put it at left side and inc both left and mid
        if mid = 1 then no need to swap just inc mid
        if mid = 2 then put it at right and dec right
        */

        int n = nums.length;
        int l = 0; 
        int m = 0;
        int r = n-1;
        while(m<=r){
            if(nums[m] == 0){
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else{
                int temp = nums[m];
                nums[m] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
    }
}