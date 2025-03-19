import java.util.*;

class Solution {
    static Set<Integer> set;
    static boolean[] visit;
    public int solution(String numbers) {
        set = new HashSet<>();
        visit = new boolean[numbers.length()];
        
        dfs(numbers,"",0);
        int answer = 0;
        for(int n : set){
            if(check(n)){
                answer++;
            }
        }
        return answer;
    }
    
    public static void dfs(String numbers, String s, int depth){
        if(depth>numbers.length()){
            return;
        }
        for(int i=0; i<numbers.length(); i++){
            if(!visit[i]){
                visit[i]=true;
                String a = s+numbers.charAt(i);
                set.add(Integer.parseInt(a));
                dfs(numbers,a,depth+1);
                visit[i]=false;
            }
            
        }
    }
    public static boolean check(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
    
}