import java.util.Hashtable;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int [] results = {};
        
        if(nums1.length == 0 || nums2.length == 0){
            return results;
        }
        
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i = 0; i < nums1.length; i++){
            if(! table.containsKey(nums1[i])){
                table.put(nums1[i], 1);
            }else{
                table.put(nums1[i], table.get(nums1[i]) + 1);
            }
        }
        
        List<Integer> inter = new ArrayList<Integer>();
        
        for(int i = 0; i < nums2.length; i++){
            
            if(table.containsKey(nums2[i])){
                inter.add(nums2[i]);
                
                if(table.get(nums2[i]) == 1){
                    table.remove(nums2[i]);
                }else{
                    table.put(nums2[i], table.get(nums2[i]) - 1);
                }
            }
            
        }
        
        
        int [] results1 = new int[inter.size()];
        for(int i = 0; i< inter.size(); i++){
            results1[i] = inter.get(i);
        }
        
        
        
        return results1;
    }
}