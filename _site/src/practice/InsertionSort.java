package practice;

public class InsertionSort {

//    public static void insertionSort (int[] array) {
//        int size = array.length;
//        int key;
//        int j = 0;
//        for(int i=1; i<size; i++) { // 처음 0번째 데이터는 정렬된 상태로 본다
//            key = array[i];
//            for (j=i-1; j>=0 && array[j]>key; j--) {
//                array[j+1] = array[j];
//            }
//            array[j+1] = key;
//        }
//
//        for(int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }

    public static void insertionSort(int[] array) {

        for(int i=1; i<array.length; i++) {
            for(int j=i; j>0; j--) {
                if(array[j-1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main (String [] args) {
        int [] data = {66, 10, 1, 99, 5};
        insertionSort(data);
    }
}
