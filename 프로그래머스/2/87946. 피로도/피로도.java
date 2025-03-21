import java.util.*;

class Solution {
    static boolean[] visit;
    static int answer;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        answer=0;
        dfs(k,dungeons,0);
        
        return answer;
    }
    
    public void dfs(int k, int[][] dungeons, int count){
        answer=Math.max(answer,count);
        for(int i=0; i<dungeons.length; i++){
            if(!visit[i]){
                if(k>=dungeons[i][0]){
                    visit[i]=true;
                    answer=Math.max(count+1,answer);
                    dfs(k-dungeons[i][1],dungeons,count+1);
                    visit[i]=false;
                }
            }
            
        }
    }
}