import java.util.Random;
public class Tester {
    private Random gen = new Random();
    private SortingAlgorithm sa;

    Tester(SortingAlgorithm sa){
        this.sa = sa;
    }
    public double singleTest(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = gen.nextInt();
        }
        double startTime = System.currentTimeMillis();
        sa.sorty(arr);
        double endTime = System.currentTimeMillis();
        double totalTime = endTime - startTime;

        return totalTime;
    }
    public  void test(int iterations, int size){
        double time = 0;
        for(int i = 0; i < iterations; i++){
            time += singleTest(size);
        }
        double averageTime = time/iterations;
        System.out.println("Average Sorting Time: " + averageTime  + " for " + size + " elements. ");
    }

    //11
    public int[] generateKSorted(int[] arr) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            //to find gap
            int start = Math.max(0, i - 10);
            int end = Math.min(arr.length - 1, i + 10);

            int j = gen.nextInt(end - start + 1) + start;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    //11
    public double singleTestK(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = gen.nextInt();
        }
        int[] ksorted = generateKSorted(arr);
        double startTime = System.currentTimeMillis();
        sa.sorty(ksorted);
        double endTime = System.currentTimeMillis();
        double totalTime = endTime - startTime;

        return totalTime;
    }
    //11
    public  void testK(int iterations, int size){
        double time = 0;
        for(int i = 0; i < iterations; i++){
            time += singleTestK(size);
        }
        double averageTime = time/iterations;
        System.out.println("Average K-Sorting Time: " + averageTime + " for " + size + " elements. ");
    }

}
