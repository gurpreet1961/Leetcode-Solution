class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;

        int ele1 = 0;
        int ele2 = 0;

        int n = nums.length;

        for(int i=0; i < n; i++){
            if(count1 ==0 && nums[i] != ele2){
                count1 = 1;
                ele1 = nums[i];
            }
            else if(count2 == 0&& nums[i] != ele1){
                count2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]){
                count1++;
            }else if(ele2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2= 0;
        for(int  i: nums){
            if(ele1 == i){
                count1++;
            }else if(ele2 ==i){
                count2++;
            }
        }
        int check = n/3;
        if(count1 > check){
            ans.add(ele1);
        }
        if(count2 > check){
            ans.add(ele2);
        }
        return ans;
    }
}