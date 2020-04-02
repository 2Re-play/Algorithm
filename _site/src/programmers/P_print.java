package programmers;

import java.util.LinkedList;

class Document {
    int idx;
    int prioritie;

    public Document(int idx, int prioritie) {
        this.idx = idx;
        this.prioritie = prioritie;
    }
}

public class P_print {

        public static int solution(int[] priorities, int location) {
            int answer = 1;
            LinkedList<Document> list = new LinkedList<Document>();

            for(int i = 0; i < priorities.length; i++) {
                list.offer(new Document( i, priorities[i]));
            }

            //첫번째 Document
            Document pivot = null;

            //대기목록 순차적으로 체크
            while(list.size()>1) {
                pivot = list.getFirst();
                for (int i = 1; i < list.size(); i++) {
                    // 대기목록의 가장 마지막으로
                    if (pivot.prioritie < list.get(i).prioritie) {
                        list.addLast(pivot);
                        list.removeFirst();
                        break;
                    }
                    // 인쇄
                    if (i == list.size()-1) {
                        if(pivot.idx == location) return answer;
                        list.removeFirst();
                        answer++;
                    }
                }
            }
            return answer;
        }


    public static void main (String [] args) {

        //input : [6,9,5,7,4]
        //output : [0,0,2,2,4]
        int [] priorities = {2, 1, 3, 2};
        int [] priorities2 = {1, 1, 9, 1, 1, 1}; // 0, 1, 2, 3, 4, 5
                                                    //4, 5, 0, 1, 2, 3
        int [] priorities3 = {3, 1, 1, 2};
        System.out.println(solution(priorities2 , 0)); // 5
    }
}
