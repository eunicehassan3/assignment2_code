public class ShellSort implements SortingAlgorithm{
    public  int[] sorty(int[] arr){
        //int temp;
        int n = arr.length;
        for(int gap = n/2; gap > 0; gap /= 2){
            for(int i = gap; i < n; ++i){
                int temp = arr[i];
                int j;
                for(j = i; j >= gap && temp < arr[j - gap]; j -= gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}
