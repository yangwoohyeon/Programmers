import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int a1=answer1(answers);
        int a2=answer2(answers);
        int a3=answer3(answers);
        if(a1>a2 && a1>a3){
            answer = new int[1];
            answer[0]=1;
            return answer;
        }
        else if(a2>a1 && a2>a3){
            answer = new int[1];
            answer[0]=2;
            return answer;
        }
        else if(a3>a1 && a3>a2){
            answer = new int[1];
            answer[0]=3;
            return answer;
        }
        else if(a1==a2 && a1>a3){
            answer = new int[2];
            answer[0]=1;
            answer[1]=2;
            return answer;
        }
        else if(a2==a3 && a2>a1){
            answer = new int[2];
            answer[0]=2;
            answer[1]=3;
            return answer;
        }
        else if(a1==a3 && a1>a2){
            answer = new int[2];
            answer[0]=1;
            answer[1]=3;
            return answer;
        }
        else if(a1==a2 &&a2==a3){
            answer = new int[3];
            answer[0]=1;
            answer[1]=2;
            answer[2]=3;
            return answer;
        }
        return answer;
    }
    public int answer1(int[] answer){
        int size = answer.length;
        int count=0;
        int num=1;
        for(int i=0; i<size; i++){
            if(num==answer[i]){
                count++;
            }
            if(num==5){
                num=0;
            }
            num++;
        }
        return count;
    }
    public int answer2(int[] answer){
        int size=answer.length;
        int count=0;
        int num=1;
        for(int i=0; i<size; i++){
            if(i%2==0){
                if(answer[i]==2){
                    count++;
                }
            }
            else{
                if(num==2){
                    num+=1;
                }
                if(answer[i]==num){
                    count++;
                }
                if(num==5){
                    num=0;
                }
                num++;
            }
             
        }
        return count;
    }
    public int answer3(int[] answer){
        int size=answer.length;
        int num=0;
        int count=0;
        for(int i=0; i<size; i++){
            if(num==0 || num==1){
                if(answer[i]==3){
                    count++;
                }
                num++;
            }
            else if(num==2 || num==3){
                if(answer[i]==1){
                    count++;
                }
                num++;
            }
            else if(num==4 || num==5){
                if(answer[i]==2){
                    count++;
                }
                num++;
            }
              else if(num==6 || num==7){
                if(answer[i]==4){
                    count++;
                }
                num++;
            }
             else if(num==8 || num==9){
                if(answer[i]==5){
                    count++;
                }
                num++;
                 if(num==10){
                     num=0;
                 }
            }
        }
        return count;
    }
}