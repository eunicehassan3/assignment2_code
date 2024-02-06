import java.util.Random;
public class Tester {
    private Random gen = new Random();
    private SortingAlgorithm sa;

    Tester(SortingAlgorithm sa){
        this.sa = sa;
    }
    public  double singleTest(int size){
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
        System.out.println("Average Sorting Time: " + averageTime);
    }
}
