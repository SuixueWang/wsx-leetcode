public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character,Character> map = new HashMap<Character,Character>();
        Set<Character> set = new HashSet<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            
            if(map.containsKey(ss)){
                if(map.get(ss) != tt ){
                    return false;
                }
            }else{
                if(set.contains(tt)){
                    return false;
                }
                
                map.put(ss,tt);
                set.add(tt);
            }
        }
        
        return true;
    }
}