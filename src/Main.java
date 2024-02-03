import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        SelectionSort s = new SelectionSort();
        int[] arr = {18, 2, 9, 34, -6, 8};
        System.out.println(Arrays.toString(b.bubbleSort(arr)));
        System.out.println(Arrays.toString(i.insertionSort(arr)));
        System.out.println(Arrays.toString(s.selectionSort(arr)));
    }
}