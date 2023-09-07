class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>(); // store the 
        int prefixSum = 0;
        hm.put(0,1); // Initially sum is zero so store that
        int n =nums.length;
        int count = 0;

        // if at i prefix sum = x and we are finding k then if at ith index it will have x -k as prefix sum
        for(int  i = 0; i < n; i++){
            prefixSum += nums[i];
            int x = prefixSum - k;
            if(hm.containsKey(x)){
                count += hm.get(x); // so we can make that number of subarray as much count we get get of x that is prefixSum - k
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        } 

        return count;
    }
}