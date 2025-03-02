import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int head = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        while(head<progresses.length){
        
            for(int i=head; i<progresses.length; i++){
                progresses[i] = progresses[i] + speeds[i];
            }
            
            if(progresses[head]>=100){ //배포 작업
                int count = 0;
                while(true){
                    count+=1;
                    head+=1;
                    if(head>progresses.length-1){
                        head=100;
                        break;
                    }
                    if(progresses[head]<100){
                        break;
                    }
                }
                queue.add(count);
            }    
            
          
        }
        int[] answer = new int[queue.size()];
        int i=0;
        while(!queue.isEmpty()){
            answer[i] = queue.poll();
            i++;
        }
        return answer;
    }
}