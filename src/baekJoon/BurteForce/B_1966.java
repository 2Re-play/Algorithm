package baekJoon.BurteForce;

import java.util.*;

class Document {
    int index, priority;

    public Document (int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

public class B_1966 {

    private static void solution () {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] result = new int[testCase];
        for(int i=0; i<testCase; i++) {
            int n = sc.nextInt();
            int targetIndex = sc.nextInt();
            LinkedList<Document> queue = new LinkedList<Document>();

            for(int j=0; j<n; j++) {
                queue.offer(new Document(j, sc.nextInt()));
            }

            int count = 1;
            while(true) {
                if(isMax(queue)) {
                    if(queue.get(0).index == targetIndex) {
                        result[i] = count;
                        break;
                    } else {
                        queue.poll();
                        count++;
                    }
                } else {
                    queue.offer(queue.poll());
                }
            }
        }

        for(int item : result) {
            System.out.println(item);
        }

    }

    private static boolean isMax (LinkedList<Document> queue) {
        for(int i=1; i<queue.size(); i++) {
            if(queue.getFirst().priority < queue.get(i).priority) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solution();
    }
}
