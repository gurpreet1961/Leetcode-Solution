class Solution {
    private void backtrack(int[] nums,List<List<Integer>>ans, List<Integer> al){
       if(al.size() == nums.length){
            ans.add(new ArrayList<>(al));
           return;
       }
            for(int i = 0; i < nums.length; i++){
                if(al.contains(nums[i])) continue;
                al.add(nums[i]);
                backtrack(nums,ans,al);
                al.remove(al.size()-1);
            }
       
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        backtrack(nums,ans,al);
        return ans;
    }
}