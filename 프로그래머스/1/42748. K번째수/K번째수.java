import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<commands.length; i++){
            int x = commands[i][0];
            int y = commands[i][1];
            int z = commands[i][2];
            int size = (y-x)+1;
            int[] arr = new int[size];
            
            int k =0;
            for(int j=x-1; j<=y-1; j++){
                arr[k]=array[j];
                k+=1;
            }
            
            Arrays.sort(arr);
            queue.add(arr[z-1]);
        }
        
        int a = queue.size();
        int[] answer = new int[a];
        
        for(int i=0; i<a; i++){
            answer[i]=queue.poll();
        }
        
        return answer;
    }
}