class RandomizedSet {
    int count = 0;
        HashSet<Integer> hs; 
    public RandomizedSet() {
        hs = new HashSet<>();
    }
    
    public boolean insert(int val) {   
        boolean res = hs.contains(val);
        hs.add(val);
        return !res;
    }
    
    public boolean remove(int val) {
        boolean res = hs.contains(val);
        hs.remove(val);
        return res;
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(hs);
       int r=(int)(Math.random()*hs.size());
        
       return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */