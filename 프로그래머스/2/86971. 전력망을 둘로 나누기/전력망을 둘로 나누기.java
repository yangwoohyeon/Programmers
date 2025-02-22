import java.util.*;

class Solution {
    int[][] arr;
    public int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int[n+1][n+1];
        
        for(int i=0; i<wires.length; i++){
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i=0; i<wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];

            arr[a][b]=0;
            arr[b][a]=0;
            
            answer= Math.min(answer,bfs(n,a));
            
            arr[a][b]=1;
            arr[b][a]=1;
        }
        
        
        return answer;
    }
    
    public int bfs(int n, int start){
        boolean[] visit = new boolean[n+1];
        int cnt = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(start);
        
        while(!queue.isEmpty()){
            int point = queue.poll();
            visit[point]=true;
            
            for(int i=0; i<=n; i++){
                if(visit[i]==true){
                    continue;
                }
                if(arr[point][i]==1){
                    queue.offer(i);
                    cnt++;
                }
            }
            
        }
        
        return (int)Math.abs(cnt-(n-cnt));
        
    }
}