class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];
        for(int i = 0 ; i < n; i++) {
            int t =target-nums[i];
            if(hm.containsKey(nums[i])){
                ans[0] = hm.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            hm.put(t,i);
        }
        return ans;
    }
}