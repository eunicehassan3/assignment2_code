import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        SelectionSort s = new SelectionSort();
        MergeSort m = new MergeSort();
        ShellSort sh = new ShellSort();
        Tester t1 = new Tester(b);
        System.out.println("Test: " + t1.singleTest(1000));
         t1.test(20, 1000);
        int[] arr = {18, 2, 9, 34, -6, 8};
        System.out.println(Arrays.toString(b.sorty(arr)));
        System.out.println(Arrays.toString(i.sorty(arr)));
        System.out.println(Arrays.toString(s.sorty(arr)));
        System.out.println(Arrays.toString(sh.sorty(arr)));
        System.out.println(Arrays.toString(m.sorty(arr)));
    }
}