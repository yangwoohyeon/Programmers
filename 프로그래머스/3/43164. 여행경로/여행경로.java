import java.util.*;

class Solution {
    public static  boolean[] visit;
    public static List<String> result = new LinkedList<>();
    
    public String[] solution(String[][] tickets) {
        String[] answer =new String[tickets.length+1];
        visit = new boolean[tickets.length];
  
        Arrays.sort(tickets, Comparator.comparing(o -> o[1]));

        
        dfs(tickets,"ICN",0,new ArrayList<>());

        
        return result.toArray(new String[0]);
    }
    public void dfs(String[][] tickets,String current,int count,List<String> path){
     
        path.add(current);
        
        if(count==tickets.length){
            if(result.isEmpty() || path.toString().compareTo(result.toString())<0){
                result.clear();
                result.addAll(path);
            }
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(tickets[i][0].equals(current) && visit[i]==false){
                visit[i]=true;
                dfs(tickets,tickets[i][1],count+1,new ArrayList<>(path));
                visit[i]=false;
            }
        }
        return;
    }
}