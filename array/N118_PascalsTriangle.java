public class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> preList = new ArrayList<Integer>();
        
        for(int i = 0; i<numRows; i++){
            
            List<Integer> subArray = new ArrayList<Integer>();
            if(i==0){
                subArray.add(1);
            }else if(i==1){
                subArray.add(1);
                subArray.add(1);
            }else{
                subArray.add(1);
                for(int j = 1; j<i; j++){
                    subArray.add(preList.get(j-1) + preList.get(j));
                }
                subArray.add(1);
            }
            
            triangle.add(subArray);
            preList = subArray;
        }
        
        return triangle;
    }
}