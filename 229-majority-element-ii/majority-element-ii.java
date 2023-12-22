class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = 0;
        int ele2 = 0;

        int count1 = 0;
        int count2 = 0;

        for(int i : nums){
            if(count1 == 0 && i != ele2){
                ele1 = i;
                count1 = 1;
            }
            else if (count2 == 0 && i != ele1){
                ele2 = i;
                count2 = 1;
            }
            else if(i == ele1){
                count1++;
            }else if(i==ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }

        }
        ArrayList<Integer> al = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for(int i: nums){
            if(i == ele1){
                count1++;
            }
            else if(i == ele2){
                count2++;
            }
        }
        int check = nums.length/3; 
        if(count1 > check){
            al.add(ele1);
        }
        if(count2 > check){
            al.add(ele2);
        }
        return al;
    }
}