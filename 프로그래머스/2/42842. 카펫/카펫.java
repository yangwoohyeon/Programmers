import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown+yellow;
        boolean[] visit = new boolean[sum+1];
        int a=0;
        int b=0;
        int ans_a=0;
        int ans_b=0;
        for(int i=1; i<sum; i++){
            if(sum%i==0){
            a = sum/i;
            b = i;
            if((a-2) * (b-2) == yellow){
                ans_a=a;
                ans_b=b;
                break;
            }
            if(visit[a]==true && visit[b]==true){
                break;
            }
                
            visit[a]=true;
            visit[b]=true;
            
            ans_a=a;
            ans_b=b;
                
            }
            
        }
        
        int[] answer = new int[2];
            
            if(ans_a>ans_b){
                answer[0]=ans_a;
                answer[1]=ans_b;
            }
            else{
                answer[0]=ans_b;
                answer[1]=ans_a;
            }
            
            return answer;
    }
}