class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0 ; i < nums.length; i++){

            if(hm.containsKey(nums[i])){
                arr[0] = hm.get(nums[i]);
                arr[1] = i;
                return arr;
            }else{
                hm.put(target-nums[i],i);
            }
        }
        return arr;


       
    }
}