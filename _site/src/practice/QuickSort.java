package practice;

public class QuickSort {

    public static int[] quickSort (int[] array, int l, int r) {

        int left = l; // 시작 인덱스
        int right = r; // 마지막 인덱스
        int pivot = array[(l+r)/2]; // 중간 값 피봇 지정

        do {
            while(array[left] < pivot) left++; //배열의 앞쪽부터 피봇과 비교하며 작으면 left++ 0
            while (array[right] > pivot) right--; //배열의 뒷쪽부터 피봇과 비교하며 크면 right-- 5
            if(left <= right) { // 0 <= 5
                int temp = array[left]; // 66
                array[left] = array[right]; // 5를 배열 맨 앞으로 위치
                array[right] = temp; // 66을 배열의 맨 뒤로 위치
                left++; // 1
                right--; // 4
            }

        } while (left <= right); // 1 4

        if(l<right) quickSort(array, l, right);
        if(r>left) quickSort(array, left, r);
        return array;
    }

    public static void main (String [] args) {
        int [] data = {66, 10, 1, 34, 5, -10};
        int[] w = quickSort(data, 0, data.length-1);
        for(int i=0; i<data.length; i++) {
            System.out.println(w[i]);
        }
    }
}
