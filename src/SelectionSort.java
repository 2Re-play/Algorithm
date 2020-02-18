public class SelectionSort {

    public static void selectionSort(int[] array){
        int size = array.length;
        int min; // 최솟값의 배열 인덱스
        int temp; // 배열 값 교환을 위한 임시 변수

        for(int i=0; i<size-1; i++) {
            min = i; // 앞에서부터 i를 잡고
            for(int j=i+1; j<size; j++) { // 나의 앞에 요소부터 사이즈까지 순회를 돈다.
                if(array[min] > array[j]) { // 만약 나보다 작은 것이 나오면 min의 인덱스 변경
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        for(int k=0; k<array.length; k++) {
            System.out.println(array[k]);
        }
    }

    public static void main (String [] args) {
        int [] data = {66, 10, 1, 99, 5};
        selectionSort(data);
    }
}
