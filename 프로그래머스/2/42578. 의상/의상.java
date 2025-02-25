import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] row : clothes){
            if(map.containsKey(row[1])){
                int n = map.get(row[1]);
                map.replace(row[1],n+1);
            }else{
                map.put(row[1],1);
            }
            
        }
        
        
        int answer =1;
     for(int count : map.values()){
         answer = answer * (count+1);
     }
        
        return answer-1;
        
    }
}