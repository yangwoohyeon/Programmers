import java.util.PriorityQueue;

public class Problem42626 {
    public int solution(int[] scoville, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int answer = 0;
        for(int sc : scoville){
            minHeap.offer(sc);
        }
        if(minHeap.peek()>=k){
            return answer;
        }

        while(minHeap.peek()<k){
            if(minHeap.size()<2){
                return -1;
            }
            else{
                int min1 = minHeap.poll();
                int min2 = minHeap.poll();
                int mix=min1+min2*2;
                minHeap.offer(mix);
                answer++;

            }

        }
        return answer;
    }
}
