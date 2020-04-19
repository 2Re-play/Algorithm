package naver;

public class hackday_2020_summer_03 {

    private static void solution(int n, int m, int k) {

        long answer = 0;
        int skiSlope = m/2;
        int boardSlope = m/2;

        // n > m -> return 0
        // n * k < m -> return 0


    }

    public static void main(String[] args) {
        // n개의 슬로프
        int n1 = 3;
        int n2 = 10;
        int n3 = 2;
        int n4 = 50;
        // 전체 m의 너비
        int m1 = 8;
        int m2 = 6;
        int m3 = 10;
        int m4 = 150;
        // 각각의 슬로프의 너비는 1이상 k이하인 자연수
        // 각 슬로프의 최대넓이는 k
        int k1 = 4; // 6
        int k2 = 5; // 0
        int k3 = 4; // 0
        int k4 = 20; //780361386

        solution(n1, m1, k1);

    }
}
