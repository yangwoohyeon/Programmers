import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visit = new boolean[words.length];
        Queue<Integer> queue = new LinkedList<>();
        boolean con = false;
        int level = 0;
        for(int i=0; i<words.length; i++){
            if(target.equals(words[i])){
                con=true;
                break;
            }
        }
        
        if(con==false){
            return 0;
        }
        
        queue.add(-1);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            
            for(int i=0; i<size; i++){
                int position=queue.poll();
                String currentWords;
                if(position==-1){
                    currentWords=begin;
                }
                else{
                    currentWords=words[position];
                }
                
                for(int j=0; j<words.length; j++){
                    if(!visit[j] && checkConvert(currentWords,words[j])){
                        queue.add(j);
                        visit[j]=true;
                        if(words[j].equals(target)){
                            return level;
                        }
                    }
                }
                
            }
        }
        
        return 0;
    }
    
    public boolean checkConvert(String a, String b){
        int size = a.length();
        int count=0;
        for(int i=0; i<size; i++){
            if(a.charAt(i)!=b.charAt(i)){
                count++;
            }
        }
        
        if(count==1){
            return true;
        }
        else return false;
    }
}