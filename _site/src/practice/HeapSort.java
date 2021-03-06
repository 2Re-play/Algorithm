package practice;

public class HeapSort {
    private static int[] data;
    private static int number = 10;

    public static void heap (int[] data, int number) {

        for(int i=1; i<number; i++) {
            int child = 1;
            while (child > 0) {
                int parent = (child -1)/2;
                if(data[child] > data[parent]) {
                    int temp = data[parent];
                    data[parent] = data[child];
                    data[child] = temp;
                }
                child = parent;
            }
        }
    }



    public static void main(String [] args) {
        data = new int[10];
        System.out.println("정렬 전");
        for(int i=0; i<number; i++) {
            data[i] = (int) (Math.random()*100) + 1;
            System.out.print(data[i] + " ");
        }
        System.out.println();

        heap(data, number);

        for(int i= number-1; i>0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;

            heap(data, i);
        }

        System.out.println("정렬 후");
        for (int i=0; i< number; i++) {
            System.out.print(data[i] + " ");
        }



    }
}
