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
        Queue<Document> queue = new LinkedList<Document>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<testCase; i++) {
            queue.clear();
            int n = sc.nextInt();
            int target = sc.nextInt();
            for(int j=0; j<n; j++) {
                queue.add(new Document(j, sc.nextInt()));
            }
            int count = 1;
            while (!queue.isEmpty()) {
                int max = getMax(list);
                Document temp = queue.poll();
                if(temp.priority == max) {
                    if(temp.index == target) {
                        System.out.println(count);
                        break;
                    }
                    count++;
                    list.remove(list.indexOf(max));
                    continue;
                }
                queue.offer(temp);
            }
        }
    }

    private static int getMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++) {
            max = max < list.get(i) ? list.get(i) : max;
        }
        return max;
    }

    private static int findIndex (ArrayList<Integer> list, int priority) {
        int index = 0;
        for (int i=0; i<list.size(); i++) {
            index++;
            if(list.get(i) > priority) break;
        }
        return (index == list.size() ? 0 : index);
    }

    public static void main(String[] args) {
        solution();
    }
}
