package baekJoon.BurteForce;

import java.util.Scanner;

public class B_14502 {

    static int n;
    static int m;
    static int[][] map;
    static int[][] tempMap;
    static int[][] copyMap;
    // 상(1,0) 하(-1,0) 좌(0,-1) 우(0,1)
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int answer;

    public static void solution () {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        tempMap = new int[n][m];
        copyMap = new int[n][m];
        answer = 0;

        // input
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                map[i][j] = tempMap[i][j] = sc.nextInt();
            }
        }

        // logic
        for(int i = 0; i < n*m; i++) {
            // 행과 열의 인덱스 구하기 (전체 탐색)
            int c = (int) (i / (m * 1.0)); // 행
            int r = i%m; // 열

            // 탐색하면서 빈공간을 발견할 경우
            if(tempMap[c][r] == 0) {
                tempMap[c][r] = 1; // 해당 위치에 벽을 세운다
                dfs(i, 1); // dfs를 돌려서 경우의 수를 구한다
                tempMap[c][r] = 0; //  복구
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int v, int cnt ){
        // 전달받은 행을 기준으로 행과 열을 구한다.
        int c = (int) (v / (m*1.0)); // 행
        int r = v % m; // 열

        // 벽의 갯수
        if(cnt == 3) {
            // copymap에 복사
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    copyMap[i][j] = tempMap[i][j];
                }
            }

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(copyMap[i][j] == 2){ // copymap을 순회하면서 바이러스를 찾는다.
                        paint(i, j); // 바이러스 확산
                    }
                }
            }
            cal(); // 안전공간 계산
        } else {
            for(int i=v+1; i<n*m; i++) { // 해당위치의 +1부터 마지막까지 반복
                int cc = (int) (i / (m * 1.0)); // 행
                int rr = i%m; // 열
                if(tempMap[cc][rr] == 0) { // 빈공간이라면
                    tempMap[cc][rr] = 1; // 벽을 세우고
                    dfs(i, cnt+1); // 다시 dfs
                }
            }
        }
        // backtracking
        tempMap[c][r] = 0;
        --cnt;
    }

    public static void paint (int y, int x) {
        for(int i=0; i<4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(0<=ny && ny < n && 0 <= nx && nx < m) {
                if(copyMap[ny][nx] == 0) {
                    copyMap[ny][nx] = 3;
                    paint(ny, nx);
                }
            }
        }
    }

    public static void cal() {
        int cnt = 0;
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                if(copyMap[i][j] == 0) {
                    ++cnt;
                }
            }
        }
        if (cnt > answer) {
            answer = cnt;
        }
    }

    public static void main(String[] args) {

        solution();
    }
}
