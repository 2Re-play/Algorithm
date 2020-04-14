package naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hackday_2020_summer_02 {

    private static void solution(String[] id_list, int k) {
        Map<String, Integer> getCouponCountList = new HashMap<String, Integer>();
        int total = 0;

        for(int i=0; i<id_list.length; i++) { // 날
            String[] ids = id_list[i].split(" ");
            List<String> repeatUser = new ArrayList<String>();

            for(int j=0; j<ids.length; j++) {
                if(!repeatUser.contains(ids[j])) {
                    if(getCouponCountList.containsKey(ids[j])) { // 한번 이상 이미 쿠폰을 받은 경우
                        if(getCouponCountList.get(ids[j]) < k){
                            getCouponCountList.put(ids[j], getCouponCountList.get(ids[j]) + 1);
                            repeatUser.add(ids[j]);
                            total++;
                        }
                    } else { // 쿠폰을 처음 받을 경우
                        getCouponCountList.put(ids[j], 1);
                        repeatUser.add(ids[j]);
                        total++;
                    }
                }
            }
        }

        System.out.println(total);

    }

    public static void main(String[] args) {
        String[] id_list1 = {"A B C D", "A D", "A B D", "B D"};
        String[] id_list2 = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY","ELLE MAY", "ELLE ELLE ELLE", "MAY"};
        int k1 = 2; // result : 7
        int k2 = 3; // result : 8

        solution(id_list1, k1);

    }
}
