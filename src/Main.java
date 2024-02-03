import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] arr = {18, 2, 9, 34, -6, 8};
        b.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}