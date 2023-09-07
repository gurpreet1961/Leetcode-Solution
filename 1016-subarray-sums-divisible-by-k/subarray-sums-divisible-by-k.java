class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int count = 0;
        hm.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int prefixRem = sum % k;
            if(prefixRem< 0){
                //let prefixRem = -5 and k =7 then that is equal to 2 
                prefixRem += k; 
            }
            if(hm.containsKey(prefixRem)){
                count += hm.get(prefixRem);
            }
            hm.put(prefixRem, hm.getOrDefault(prefixRem, 0)+1);
        }
        return count;
    }
}