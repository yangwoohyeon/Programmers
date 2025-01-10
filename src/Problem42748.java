import java.util.Arrays;

public class Problem42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int size = commands.length;
        answer=new int[size];
        for(int i=0; i<size; i++){
            int[] arr = new int[commands[i][1]-commands[i][0]+1];
            int j=0;
            int start =commands[i][0]-1;
            while(start<=commands[i][1]-1){
                arr[j]=array[start];
                j++;
                start++;
            }
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
        }
        return answer;
    }
}
