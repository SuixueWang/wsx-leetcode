import java.util.Hashtable;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        char[] pattern_1 = pattern.toCharArray();
        
        String [] pieces = str.split(" ");
        if(pieces.length != pattern_1.length) return false;
        
        HashSet<String> set = new HashSet<String>();
        Map<Character,String> map = new HashMap<Character,String>();
        
        int i = 0;
        for(String string : pieces){
            
            char p = pattern_1[i];
            // System.out.println(p);
            
            // 如果该字符产生过映射
            if(map.containsKey(p)){
                
                // 且映射的字符串和当前字符串不一样
                if(!string.equals(map.get(p))) return false;
                
            }else{
                
                // 如果该字符没有产生过映射
                // 如果当前字符串已经被映射过了
                if(set.contains(string)) return false;
                
                // 否则新加一组映射
                map.put(p, string);
                set.add(string);
            }
            
            i++;
        }
        
        return true;
    }
}