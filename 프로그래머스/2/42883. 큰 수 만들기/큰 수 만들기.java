import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder answerBuilder = new StringBuilder();
        int len = number.length()-k; // k개를 제거했을때의 자리수
        int start=0;
        
       for(int i=0; i<len; i++){
           int max=0;
           for(int j=start; j<=i+k; j++){
               if((int)number.charAt(j)>max){
                   max=(int)number.charAt(j);
                   start=j+1;
               }
           }
          answerBuilder.append((char)max);

       }
         answer = answerBuilder.toString();
        return answer;
    }
}