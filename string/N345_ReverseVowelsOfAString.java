public class Solution {
    public String reverseVowels(String s) {
        
        if(s.length() == 0){
            return "";
        }
        
        char [] ss = s.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = ss.length-1; i >= 0; i--){
            if(ss[i] == 'a' || ss[i] == 'e' || ss[i] == 'i' || ss[i] == 'o' || ss[i] == 'u' ||
               ss[i] == 'A' || ss[i] == 'E' || ss[i] == 'I' || ss[i] == 'O' || ss[i] == 'U'){
                   
                  sb.append(ss[i]); 
            }
            
        }
        
        char [] vowels = sb.toString().toCharArray();
        
        int k = 0;
        for(int i = 0; i < ss.length; i++){
            if(ss[i] == 'a' || ss[i] == 'e' || ss[i] == 'i' || ss[i] == 'o' || ss[i] == 'u' ||
               ss[i] == 'A' || ss[i] == 'E' || ss[i] == 'I' || ss[i] == 'O' || ss[i] == 'U'){
                   
                  ss[i] = vowels[k]; 
                  k++;
            }
        }
        
        return String.valueOf(ss);
    }
}