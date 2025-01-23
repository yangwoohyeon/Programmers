import java.util.*;

class Solution {
    static int count =0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers,target,0,0);
        answer=count;
        return answer;
    }
    public static void dfs(int[] numbers,int target,int value,int start){
        if(start==numbers.length){
            if(value==target){
                count++;
            }
            return;
        }
       
                dfs(numbers,target,value+numbers[start],start+1);
                dfs(numbers,target,value-numbers[start],start+1);
            
        }
}