import java.util.Hashtable;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        List<Integer> results = new ArrayList<>();
        if(nums.length == 0 || nums == null) return results;
        
        Hashtable<Integer,Integer> table = new Hashtable<>();
        
        for(int i = 0; i < nums.length; i++){
            if(table.containsKey(nums[i])){
                table.put(nums[i], table.get(nums[i]) + 1);
            }else{
                table.put(nums[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<Integer>(table.keySet());
        Collections.sort(list, new Comparator<Object>(){
            public int compare(Object arg0, Object arg1){
                return table.get(arg1) - table.get(arg0);
            }   
        }
        );
        
        for(Integer key : list){
            if(k > 0){
                results.add(key);
                k--;
            }else{
                break;
            }
            
        }
        
        // for (Integer key : list) { 
        //   System.out.println(key + " " + table.get(key)); 
        // } 
        
        return results;
    }
}