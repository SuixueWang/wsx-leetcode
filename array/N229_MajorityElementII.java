import java.util.Hashtable;


public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> mojValue = new ArrayList<Integer>();
        Hashtable<Integer, Integer> elements = new Hashtable<Integer,Integer>();
        
        int limit = nums.length/3;
        
        for(int i = 0; i < nums.length; i++) {
            
            elements.put(nums[i], elements.getOrDefault(nums[i], 0 ) + 1);
        }
        
        Set<Integer> keys = elements.keySet(); 
        for(Integer key: keys){ 
            if(elements.get(key) > limit) {
                mojValue.add(key);
            }
        }  
        
        return mojValue;   
        
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int i: nums){
        //     if(map.containsKey(i)){
        //         map.put(i, map.get(i)+1);
        //     }else{
        //         map.put(i, 1);
        //     }
        // }
     
        // List<Integer> result = new ArrayList<Integer>();
     
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     if(entry.getValue() > nums.length/3){
        //         result.add(entry.getKey());
        //     }    
        // }
     
        // return result;
    }
}