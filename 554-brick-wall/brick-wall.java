class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        TreeMap<Long, Integer>hm = new TreeMap<>();
        long sum = 0;
        for(int i = 0; i < wall.size(); i++){
            sum = 0;
            for(int j = 0;j < wall.get(i).size(); j++){
                sum += wall.get(i).get(j);
                // if(sum > Integer.MAX_VALUE){
                //     sum = Integer.MAX_VALUE;
                // }
                hm.put(sum, hm.getOrDefault(sum,0)+1);
            }
        }
        int ans = Integer.MAX_VALUE;
        int n = wall.size();
        int count = 0 ;
        for( Map.Entry<Long,Integer> m: hm.entrySet() ){
            if(m.getKey() == sum){
                ans = Math.min(ans,m.getValue());
                break;
            }
            // System.out.print(val);
            ans = Math.min(ans, n - m.getValue());
        }
        System.out.print(hm);
        return ans;

    }
}