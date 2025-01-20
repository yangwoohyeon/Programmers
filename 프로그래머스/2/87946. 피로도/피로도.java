import java.util.*;
class Solution {
    public static int count=0;
    public static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited=new boolean[dungeons.length];
        dfs(k,dungeons,0);
        answer=count;
        return answer;
    }
    
    public void dfs(int k, int[][] dungeons, int clear){
        count=Math.max(clear,count);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]){
                if(k>=dungeons[i][0]){
                    visited[i]=true;
                    dfs(k-dungeons[i][1],dungeons,clear+1);
                    visited[i]=false;
                }
            }
        }
    }
}