package kakao;

import java.util.HashMap;

public class Kakao_2019_winter_intern_04_02 {
    static HashMap<Long, Long> hashMap;

    private static long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        hashMap = new HashMap<Long, Long>();
        for (int i=0 ; i<room_number.length; i++) {
            answer[i] = find(room_number[i])-1;
        }

        return answer;
    }

    private static long find (long roomNumber) {
        if(!hashMap.containsKey(roomNumber)) { // 방이 비어있는 경우 즉시 배정
            hashMap.put(roomNumber, roomNumber+1); // 배정된 방 번호의 +1을 부모로 설정
            return roomNumber+1;
        }
        long parent = find(hashMap.get(roomNumber)); // 방이 이미 배정되어 있는 경우 -> 해당 번호의 노드의 부모로 타고 들어가서 비어있는 방을 탐색
        hashMap.put(roomNumber, parent);
        return parent;
    }

    public static void main(String[] args) {

        long k = 10;
        long[] room_number = {1,3,4,1,3,1};
        System.out.println(solution(k, room_number));

    }
}
