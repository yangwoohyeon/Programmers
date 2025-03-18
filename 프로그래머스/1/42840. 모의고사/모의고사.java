import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] x = {1,2,3,4,5};
        int[] y = {2,1,2,3,2,4,2,5};
        int[] z = {3,3,1,1,2,2,4,4,5,5};
        
        int x_answer = 0;
        int y_answer = 0;
        int z_answer = 0;
        
        int position_x=0;
        int posx=0;
        while(true){
            if(answers[position_x]==x[posx]){
                x_answer++;
            }
            position_x+=1;
            posx+=1;
            
            if(position_x==answers.length){
                break;
            }
            if(posx==x.length){
                posx=0;
            }          
        }
        
        int position_y=0;
        int posy=0;
        while(true){
            if(answers[position_y]==y[posy]){
                y_answer++;
            }
            position_y+=1;
            posy+=1;
            
            if(position_y==answers.length){
                break;
            }
            if(posy==y.length){
                posy=0;
            }          
        }
        
        int position_z=0;
        int posz=0;
        while(true){
            if(answers[position_z]==z[posz]){
                z_answer++;
            }
            position_z+=1;
            posz+=1;
            
            if(position_z==answers.length){
                break;
            }
            if(posz==z.length){
                posz=0;
            }          
        }
        
        int max = Math.max(x_answer,Math.max(y_answer,z_answer));
        
        Queue<Integer> queue = new LinkedList<>();
        
        if(max==x_answer){
            queue.add(1);
        }
        if(max==y_answer){
            queue.add(2);
        }
        if(max==z_answer){
            queue.add(3);
        }
        
        int[] answer = new int[queue.size()];
        int n=0;
        while(!queue.isEmpty()){
           answer[n]=queue.poll();
            n++;
        }
        return answer;
    }
}