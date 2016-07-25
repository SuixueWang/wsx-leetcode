public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int [] results = {};
        
        if(nums1.length == 0 || nums2.length == 0){
            return results;
        }
        
        //将nums1存在hash set中
        Set<Integer> set_nums1 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            if(! set_nums1.contains(nums1[i])){
                set_nums1.add(nums1[i]);
            }
        }
        
        int k = 0;
        List<Integer> inter = new ArrayList<Integer>();
        
        //遍历nums2,把有交集部分存到ArrayList
        while(k < nums2.length){
            
            if(set_nums1.contains(nums2[k])){
                inter.add(nums2[k]);
                set_nums1.remove(nums2[k]);
            }
            
            k++;
        }
        
        //定义长度为inter.size()的数组保存结果并返回
        int [] results1 = new int[inter.size()];
        for(int i = 0; i< inter.size(); i++){
            results1[i] = inter.get(i);
        }
        
        
        
        return results1;
    }
}