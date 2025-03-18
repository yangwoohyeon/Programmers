import java.util.*;
    
class Solution {
    public int solution(int[][] sizes) {
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++){
            int x = sizes[i][0];
            int y = sizes[i][1];
            if(x>y){
                width[i]=x;
                height[i]=y;
            }
            else{
                width[i]=y;
                height[i]=x;
            }
        }
        Arrays.sort(width);
        Arrays.sort(height);
        
        return width[width.length-1] * height[height.length-1];
    }
}