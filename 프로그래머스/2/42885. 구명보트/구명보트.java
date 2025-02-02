import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left=0;
        int right = people.length-1;
        
        while(right>=left){
            if(people[left] + people[right]>limit){
                right--;
                answer++;
            }
            else{
                answer++;
                right--;
                left++;
            }
        }
        return answer;
    }
}