import java.util.*;

class Solution {
    public static int answer = 0;
    public static int[][] dp;
    int solution(int[][] land) {
        
        dp=new int[land.length][land[0].length];
        
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        
        int answer = 0;
        // 첫 번째 행의 모든 열을 시작점으로 DFS 수행
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, dfs(land,i, 0));
        }
        
        return answer;
    }
    
    public int dfs(int[][] land, int w, int h){
        
        if(h==land.length-1){
            return land[h][w];
        }
        if(dp[h][w]!=-1){
            return dp[h][w];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            if(i!=w){
                max=Math.max(dfs(land,i,h+1),max);
            }
        }
        return dp[h][w]=max+land[h][w];
    }
}