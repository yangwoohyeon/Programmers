import java.util.*;

class Solution {
    public static int answer;
    public static List<String> list;
    public int solution(String word) {
        list = new ArrayList<>();
        String[] ch = new String[]{"A","E","I","O","U"};
        insert(ch,"",0);
      
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(word)){
                answer=i;
            }
        }
        
        return answer;
    }
    
    public static void insert(String[] ch,String str,int depth){
        list.add(str);
        if(depth==5){
            return;
        }
        for(int i=0; i<ch.length; i++){
            insert(ch,str+ch[i],depth+1);
        }
    }
}