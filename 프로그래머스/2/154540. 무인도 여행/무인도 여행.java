import java.util.*;
class Solution {
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};
    public static   Queue<Integer> queue = new LinkedList<>();
    public static boolean[][] visit;
    public static int ans;
    public int[] solution(String[] maps) {
     
        visit = new boolean[maps.length][maps[0].length()];
        boolean check=false;
        
        for(int i=0; i<maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                ans=0;
                if(maps[i].charAt(j)!='X' && !visit[i][j]){
                    int x = dfs(i,j,maps);
                    queue.add(x);
                    check=true;
                }
                 visit[i][j]=true;
            }
        }
        if(check==false){
            int[] answer = new int[1];
            answer[0]=-1;
            return answer;
        }
        int[] answer= new int[queue.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=queue.poll();
        }
        Arrays.sort(answer);
        return answer;
    }
    public int dfs(int a, int b, String[] maps){ //a = 아래로 몇줄, b = 옆으로 몇줄
        
        visit[a][b]=true;
        int c=0;
        boolean check=false;
        for(int i=0; i<4; i++){
            int current_a=a+dx[i];
            int current_b=b+dy[i];
            if(current_a>=0 && current_a<maps.length && current_b>=0 && current_b<maps[0].length()){
            if(maps[current_a].charAt(current_b) != 'X' && !visit[current_a][current_b]){
                 c = c + dfs(current_a,current_b,maps);
                check=true;
            }
            }
        }
        if(check==false){
            return Integer.parseInt(String.valueOf(maps[a].charAt(b)));
        }
        
        else{
            return c+Integer.parseInt(String.valueOf(maps[a].charAt(b)));
        }
    }
}