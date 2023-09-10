class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(s.equals("")||t.equals("")||n<m){
            return "";
        }
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();
        String ans = "";
        for(int i = 0 ; i < m; i++){
            char ch = t.charAt(i);
            tm.put(ch, tm.getOrDefault(ch,0)+1);
        }

        int start = 0;
        int end = 0;

        int got = 0; // number of alphabet got

        while(end<n){
            while(got == m){
                if(ans.length() == 0){
                    ans = s.substring(start,end);
                }else{
                    if(ans.length() > (end-start)){
                        ans = s.substring(start,end);
                    }
                }
                char ch = s.charAt(start++);
                sm.put(ch,sm.getOrDefault(ch,0)-1);
                int x =sm.get(ch);
                int y = tm.getOrDefault(ch, Integer.MIN_VALUE);
                if(x < y){
                    
                    got--;
                }

            }
            char ch = s.charAt(end++);
            sm.put(ch,sm.getOrDefault(ch,0)+1);
            int x = tm.getOrDefault(ch,0);
            int y = sm.get(ch);
            if( x!= 0 && y<=x){
                got++;
            }
        }
        while(got == m){
            if(ans.length() == 0){
                ans = s.substring(start,end);
            }else{
                if(ans.length() > (end-start)){
                    ans = s.substring(start,end);
                }
            }
            char ch = s.charAt(start++);
            sm.put(ch,sm.getOrDefault(ch,0)-1);
            int x =sm.get(ch);
            int y = tm.getOrDefault(ch, Integer.MIN_VALUE);
            if(x < y){
                got--;
            }


        }

        return ans;        
    }
}