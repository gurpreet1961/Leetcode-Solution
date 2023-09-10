class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al = new ArrayList<>();
        int m = p.length();
        int n = s.length();
        if(m > n){
        System.out.println(m+" "+ n);
            return al;
        }
        HashMap<Character,Integer> sm = new HashMap<>();
        HashMap<Character,Integer> pm = new HashMap<>();
        for(int i = 0; i < m; i++){
            char ch = p.charAt(i);
            pm.put(ch,pm.getOrDefault(ch,0)+1);
            ch = s.charAt(i);
            sm.put(ch,sm.getOrDefault(ch,0)+1);
        }
        // System.out.print(sm);
        boolean check = true;
        for(char c : pm.keySet()){
            int x = pm.get(c);
            int y = sm.getOrDefault(c,0);
            if(x != y){
                check = false;

                break;
            }
        }

        if(check){
            al.add(0);
        }
        for(int i = m ; i < n; i++){
            sm.put(s.charAt(i-m),sm.get(s.charAt(i-m))-1);
            check = true;
            char ch = s.charAt(i);
            sm.put(ch,sm.getOrDefault(ch,0)+1);
            for(char c : pm.keySet()){
                int x = pm.get(c);
                int y = sm.getOrDefault(c,0);
                if(x != y){
                    check = false;

                    break;
                }
            }
            if(check){
                al.add(i-m+1);
            }
        }
        return al;
    }
}