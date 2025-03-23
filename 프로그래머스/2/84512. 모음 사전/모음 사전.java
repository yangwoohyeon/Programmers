import java.util.*;

class Solution {
    static int answer =0;
    static int n=0;
    public int solution(String word) {
       char[] arr = {'A','E','I','O','U'};

        dfs(word,"",arr);
        return n;
    }
    public static void dfs(String word, String str,char[] arr){
        if(word.equals(str)){
            n=answer;
            return;
        }
        if(str.length() ==5){
            return;
        }
        for(int i=0; i<5; i++){
            answer++;
            dfs(word,str+arr[i],arr);
        }
        return;
    }
}