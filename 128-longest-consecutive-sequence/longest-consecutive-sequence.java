class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int ele: nums){
            ts.add(ele);
        }
        System.out.print(ts);
        int max = 0;
        int cur = 0;
        long count = 1;
        int prev = 0;
        for(int ele: ts){
            if(count ==1){
                count++;
                cur++;
            }else{
                if(ele-1 == prev){
                    cur++;
                }else{
                    max = Math.max(max,cur);
                    cur = 1;
                }
            }
            prev = ele;
        }
        max = Math.max(max,cur);
        return max;
    }
}