import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){  //처음에는 스택이 비어있으므로 스택과 큐에 모두 삽입
                stack.push(arr[i]);
                queue.add(arr[i]);
            }
            
            else{
                int n = stack.pop();
                if(n!=arr[i]){ //연속된 수가 아니라면 큐와 스택에 추가
                    stack.push(arr[i]);
                    queue.add(arr[i]);
                }
                else{
                    stack.push(n);
                }
            }
        }
        
        int[] answer = new int[queue.size()];
        int i=0;
        while(!queue.isEmpty()){
            answer[i]=queue.poll();
            i++;
        }
        
        return answer;
    }
}