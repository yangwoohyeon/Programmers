import java.util.*;

class Solution {
    public static int[][] computer;
    public static boolean[] visit;
    public static int answer;
    public int solution(int n, int[][] computers) {
        answer=0;
        computer= computers;
        visit=new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visit[i]){
                dfs(i,n);
                answer++;
            }
        }
        
        
        return answer;
    }
    
    public static void dfs(int start,int n){
        visit[start]=true;
        for(int i=0; i<n; i++){
            if(!visit[i] && computer[start][i]==1 && i!=start){
                dfs(i,n);
            }
        }
    }
}