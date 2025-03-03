import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); //내림차순
        int targetNum = priorities[location];
        for(int n : priorities){
            queue.add(n);
        }
        int answer = 0;
        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == queue.peek()){
                    queue.poll();
                    answer++;
                    if(i==location){
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}