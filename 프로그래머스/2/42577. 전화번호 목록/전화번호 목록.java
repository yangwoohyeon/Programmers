import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String,String> map = new HashMap<>();
        boolean answer = true;
        for(String s : phone_book){
            map.put(s,s);
        }
        
        for(int i=0; i<phone_book.length; i++){
            String a = phone_book[i];
            for(int j=0; j<a.length(); j++){
                if(map.containsKey(a.substring(0,j))){
                    answer=false;
                    return answer;
                }
            }
        }
        return answer;
    }
}