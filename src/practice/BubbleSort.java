package practice;

public class BubbleSort {

    public static void bubbleSort (int [] array) {
        int size = array.length;
        int temp = 0;

        for(int i=size-1; i>=0; i--) {
            for(int j=0; j<i; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i=0; i<size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main (String [] args) {
        int [] data = {66, 10, 1, 99, 5};
        bubbleSort(data);
    }
}
