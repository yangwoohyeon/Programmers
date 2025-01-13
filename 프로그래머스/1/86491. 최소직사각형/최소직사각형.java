import java.util.*;
    
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_h = 0;
        int max_v = 0;
        
        for(int i=0; i<sizes.length; i++){
            int h = Math.min(sizes[i][0],sizes[i][1]);
            int v = Math.max(sizes[i][0],sizes[i][1]);
            
             max_h = Math.max(h,max_h);
             max_v = Math.max(v,max_v);
        }
        answer= max_h*max_v;
        return answer;
    }
 
}