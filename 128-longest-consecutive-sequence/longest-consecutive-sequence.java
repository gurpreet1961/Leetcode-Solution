class Solution {
    public int longestConsecutive(int[] nums) {
        /**Using Tree set to store in sorted order */
        // TreeSet<Integer> ts = new TreeSet<>();
        // for(int ele: nums){
        //     ts.add(ele);
        // }
        // System.out.print(ts);
        // int max = 0;
        // int cur = 0;
        // long count = 1;
        // int prev = 0;
        // for(int ele: ts){
        //     if(count ==1){
        //         count++;
        //         cur++;
        //     }else{
        //         if(ele-1 == prev){
        //             cur++;
        //         }else{
        //             max = Math.max(max,cur);
        //             cur = 1;
        //         }
        //     }
        //     prev = ele;
        // }
        // max = Math.max(max,cur);
        // return max;

        /**OPTIMAL SOLUTION */
        HashSet<Integer> hs = new HashSet<>();

        for(int ele: nums){
            hs.add(ele);
        }
        int max = 0;
        for(int ele: hs){
            if(hs.contains(ele-1)){
                continue;
            }else{
                int count = 1;
                while(true){
                    if(hs.contains(ele+count)){
                        count++;
                    }else{
                        max = Math.max(count , max);
                        break;
                    }
                }
            }
        }
        return max;
    }
}