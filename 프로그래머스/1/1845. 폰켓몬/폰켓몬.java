import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a,a);
        }
        
        int s = map.size();
        int half = nums.length/2;
        if(s>=half){
            return half;
        }
        else {
            return s;
        }
    }
}