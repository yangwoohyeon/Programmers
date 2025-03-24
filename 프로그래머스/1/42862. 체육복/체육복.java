import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        boolean[] extra = new boolean[reserve.length];
        boolean[] lostStudent = new boolean[lost.length]; //이미 빌려서 다시 빌릴필요가 없는 학생
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i=0; i<lost.length; i++){ //여벌의 체육복을 가지고 왔는데 분실한 경우여벌의 체육복을 가지고 왔는데 분실한 경우
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j] && extra[j]==false){
                    extra[j]=true;
                    lostStudent[i]=true;
                    answer++;
                    j=reserve.length;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){ //다른사람에게 여벌을 빌려주는 경우
            for(int j=0; j<reserve.length; j++){
                if(!lostStudent[i]){
                if((lost[i]-1)==reserve[j]){
                    if(!extra[j]){
                        answer++;
                        extra[j]=true;
                        j=reserve.length;
                    }
                }
                else if((lost[i]+1)==reserve[j]){
                    if(!extra[j]){
                        answer++;
                        extra[j]=true;
                        j=reserve.length;
                    }
                }
            }
            }
        }
        
        return answer;
    }
 
}