import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        int[] arr = {18, 2, 9, 34, -6, 8};
       // i.insertionSort(arr);
        //b.bubbleSortI(arr);
        System.out.println(Arrays.toString(b.bubbleSort(arr)));
        System.out.println(Arrays.toString(i.insertionSort(arr)));
    }
}