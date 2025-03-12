import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<prices.length; i++){
            int n = prices[i];
            int time = 0;
            if(i!=prices.length-1){
            for(int j=i+1; j<prices.length; j++){
                time++;
                if(n>prices[j]){
                    break;
                }
            }
        }
            queue.add(time);
        }
        
        int size = queue.size();
        answer=new int[size];
        for(int i=0; i<size; i++){
            answer[i]=queue.poll();
        }
        
        return answer;
    }
}