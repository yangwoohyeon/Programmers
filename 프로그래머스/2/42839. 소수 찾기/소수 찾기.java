import java.util.*;

class Solution {
    static Set<Integer> set;
    static boolean[] visit = new boolean[7];
    
    public int solution(String numbers) {
        int answer = 0;
        set = new HashSet<>();
        int size = numbers.length();
        
        dfs(numbers,"",0);
        
        for(int num : set){
            if(check(num)){
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
                set.add(Integer.parseInt(s+numbers.charAt(i)));
                dfs(numbers,s+numbers.charAt(i),depth+1);
                visit[i]=false;
            }
        }
    }
    public static boolean check(int num){
        if(num<2){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}