package kakao;

import java.util.ArrayList;

public class Kakao_2019_winter_intern_04_01 {

    private static long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        ArrayList<Long> list = new ArrayList<Long>();

        for(int i=0; i<room_number.length; i++) {
            long room = room_number[i];
            if(list.contains(room)) { // 만약 room이 이미 예약된 경우
                long index = room + 1;
                while (true) {
                    if(list.contains(index)) {
                        index++;
                    } else {
                        list.add(index);
                        answer[i] = index;
                        break;
                    }
                }
            } else {
                list.add(room);
                answer[i] = room;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        long k = 10;
        long[] room_number = {1,3,4,1,3,1};
        System.out.println(solution(k, room_number));

    }
}
