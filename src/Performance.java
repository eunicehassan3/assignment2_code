public class Performance {

    public static void main(String[] args) {
        SortingAlgorithm bubble = new BubbleSort();
        SortingAlgorithm insertion = new InsertionSort();
        SortingAlgorithm quick = new QuickSort();
        SortingAlgorithm selection = new SelectionSort();
        SortingAlgorithm merge = new MergeSort();
        SortingAlgorithm shell = new ShellSort();
        Tester bubbleTest = new Tester(bubble);
        Tester insertionTest = new Tester(insertion);
        Tester quickTest = new Tester(quick);
        Tester selectionTest = new Tester(selection);
        Tester mergeTest = new Tester(merge);
        Tester shellTest = new Tester(shell);

        System.out.println("Sorting Algorithm - Bubble Sort");
        bubbleTest.test(20, 100);
        bubbleTest.test(20, 500);
        bubbleTest.test(20, 1000);
        bubbleTest.test(20, 2000);
        bubbleTest.test(20, 5000);
        bubbleTest.test(20, 10000);
        bubbleTest.test(20, 20000);
        bubbleTest.test(20, 75000);
        bubbleTest.test(20, 150000);
        System.out.println("\n");

        System.out.println("Sorting Algorithm - Insertion Sort");
        insertionTest.test(20, 100);
        insertionTest.test(20, 500);
        insertionTest.test(20, 1000);
        insertionTest.test(20, 2000);
        insertionTest.test(20, 5000);
        insertionTest.test(20, 10000);
        insertionTest.test(20, 20000);
        insertionTest.test(20, 75000);
        insertionTest.test(20, 150000);
        System.out.println("\n");

        System.out.println("Sorting Algorithm - Selection Sort");
        selectionTest.test(20, 100);
        selectionTest.test(20, 500);
        selectionTest.test(20, 1000);
        selectionTest.test(20, 2000);
        selectionTest.test(20, 5000);
        selectionTest.test(20, 10000);
        selectionTest.test(20, 20000);
        selectionTest.test(20, 75000);
        selectionTest.test(20, 150000);
        System.out.println("\n");

        System.out.println("Sorting Algorithm - Quick Sort");
        quickTest.test(20, 100);
        quickTest.test(20, 500);
        quickTest.test(20, 1000);
        quickTest.test(20, 2000);
        quickTest.test(20, 5000);
        quickTest.test(20, 10000);
        quickTest.test(20, 20000);
        quickTest.test(20, 75000);
        quickTest.test(20, 150000);
        System.out.println("\n");

        System.out.println("Sorting Algorithm - Merge Sort");
        mergeTest.test(20, 100);
        mergeTest.test(20, 500);
        mergeTest.test(20, 1000);
        mergeTest.test(20, 2000);
        mergeTest.test(20, 5000);
        mergeTest.test(20, 10000);
        mergeTest.test(20, 20000);
        mergeTest.test(20, 75000);
        mergeTest.test(20, 150000);
        System.out.println("\n");

        System.out.println("Sorting Algorithm - Shell Sort");
        shellTest.test(20, 100);
        shellTest.test(20, 500);
        shellTest.test(20, 1000);
        shellTest.test(20, 2000);
        shellTest.test(20, 5000);
        shellTest.test(20, 10000);
        shellTest.test(20, 20000);
        shellTest.test(20, 75000);
        shellTest.test(20, 150000);
        System.out.println("\n");

    }

}
