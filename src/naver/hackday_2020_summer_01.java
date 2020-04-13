package naver;

import java.util.ArrayList;

public class hackday_2020_summer_01 {

    private static void solution(int n, int[][] delivery) {

        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> remindProduct = new ArrayList<Integer>();
        ArrayList<Integer> noRemindProduct = new ArrayList<Integer>();
        // 없으면 X 있으면 O 모르면 ?
        // 배송완료 1, 미배송 0

        for(int j=0; j<2; j++) {
            for(int i=0; i<delivery.length; i++) {
                if(delivery[i][2] == 1) { // 배송 완료
                    if(!remindProduct.contains(delivery[i][0])) { // 배송 완료인데 데이터가 없는 경우 넣기
                        remindProduct.add(delivery[i][0]);
                    }
                    if(!remindProduct.contains(delivery[i][1])) { // 배송 완료인데 데이터가 없는 경우 넣기
                        remindProduct.add(delivery[i][1]);
                    }
                }
                if(delivery[i][2] == 0) { // 미배송
                    if(remindProduct.contains(delivery[i][0]) && !remindProduct.contains(delivery[i][1]) && !noRemindProduct.contains(delivery[i][1])) { // 첫번째 제품은 재고 있고 두번째는 없는 경우
                        noRemindProduct.add(delivery[i][1]);
                    } else if (remindProduct.contains(delivery[i][1]) && !remindProduct.contains(delivery[i][0]) && !noRemindProduct.contains(delivery[i][0])) {
                        noRemindProduct.contains(delivery[i][0]);
                    }
                }
            }
        }

        for(int i=1; i<=n; i++) {
            if(remindProduct.contains(i)) {
                sb.append("O");
            } else if (noRemindProduct.contains(i)) {
                sb.append("X");
            } else {
                sb.append("?");
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 7;
        int[][] delivery1 = {{1,3,1}, {3,5,0}, {5,4,0}, {2,5,0}}; //"0?0?X?"
        int[][] delivery2 = {{5,6,0}, {1,3,1}, {1,5,0}, {7,6,0}, {3,7,1}, {2,5,0}}; //"0?0?XX0"
        solution(n1, delivery1);

    }
}
