package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class P_truck {


    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time =0;
        int index = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] endTime = new int[truck_weights.length];

        while(true) {
            // remove bus
            if(!queue.isEmpty() && endTime[queue.peek()] == time) {
                weight += truck_weights[queue.poll()];
            }
            // add bus
            if(index < truck_weights.length && truck_weights[index] <= weight) {
                queue.offer(index);
                endTime[index] = time + bridge_length;
                weight -= truck_weights[index];
                index++;
            }
            time ++;
            if(queue.isEmpty()) break;

        }

        return time;
    }

    public static void main (String [] args) {

        int bridge_length = 2;
        int weight = 10;
        int [] truck_weights = {7,4,5,6};
        System.out.println(solution(bridge_length, weight, truck_weights)); // 8
    }
}
