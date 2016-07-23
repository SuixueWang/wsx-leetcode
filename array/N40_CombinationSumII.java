public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        findCombinationSum(results,current,candidates,target,0,0);
        
        return results;
        
    }
    
    public void findCombinationSum(List<List<Integer>> results,List<Integer> current,int[] candidates,int target,int sum,int level) {
        
        if(sum > target){
            return ;
        }else if(sum == target) {
            results.add(new ArrayList<>(current));
                
            return ;
        }
        
        int prev = -1;
        for(int i = level; i < candidates.length; i++) {
            if( prev != candidates[i] ){
                
                current.add(candidates[i]);
                findCombinationSum(results,current,candidates,target,sum+candidates[i],i+1);
                current.remove(current.size()-1);
                
                prev = candidates[i];
            }
        }
        
    }
}