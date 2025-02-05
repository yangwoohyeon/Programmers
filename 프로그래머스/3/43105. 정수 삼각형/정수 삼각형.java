import java.util.*;

class Solution {
     int[][] dp;
    int answer = 0;
    public int solution(int[][] triangle) {
        dp = new int[triangle.length][triangle.length];
        for(int[] row : dp){
            Arrays.fill(row,-1); //dp배열을 -1로 초기화
        }
        return dfs(triangle,0,0);
    }
    
    public int dfs(int[][] triangle, int h, int w){
       
        if(h==triangle.length-1){
            return triangle[h][w];
        }
        if(dp[h][w]!=-1){
            return dp[h][w];
        }
        int left = dfs(triangle,h+1,w);
        int right = dfs(triangle,h+1,w+1);
        
       return dp[h][w] = triangle[h][w]+Math.max(left,right);
    }
}