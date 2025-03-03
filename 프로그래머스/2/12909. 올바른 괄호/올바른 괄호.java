import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        
        for(int i=0; i<size; i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        boolean b=false;
        if(stack.isEmpty()){
            b=true;
        }
        return b;
    }
}