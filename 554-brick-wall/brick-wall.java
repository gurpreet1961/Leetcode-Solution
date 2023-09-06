class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        TreeMap<Integer, Integer>hm = new TreeMap<>(); //it store element in stored order of key
        int sum = 0;
        int n = wall.size();
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = 0;j < wall.get(i).size()-1; j++){
                sum += wall.get(i).get(j);
                hm.put(sum, hm.getOrDefault(sum,0)+1);
            }
        }
        if(hm.size() == 0){
            return n;
        }
        int ans = Integer.MAX_VALUE;
        int count = 0 ;
        for( Map.Entry<Integer,Integer> m: hm.entrySet() ){
            ans = Math.min(ans, n - m.getValue());
        }
        System.out.print(hm);
        return ans;

    }
}