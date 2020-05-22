package programmers;

public class P_findSquare {

    private static long solution (int w, int h) {
        long answer = 0;
        long Lw = Long.parseLong(String.valueOf(w));
        long Lh = Long.parseLong(String.valueOf(h));

        return (Lw * Lh) - ( Lw + Lh - gcd(w, h));
    }

    private static long gcd (long w, long h) {
        long small,big;

        big = w >= h ? w : h;
        small = w < h ? w : h;

        while ( small != 0 ) {
            long nmg = big % small;
            big = small;
            small = nmg;
        }
        return big;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }
}
