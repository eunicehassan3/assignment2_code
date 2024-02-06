public class QuickSort implements SortingAlgorithm{
    public int findPivot(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        int low = start;
        int high = end;

        boolean done = false;
        while (!done) {
            while (arr[low] < pivot) {
                low = low + 1;
            }
            while (pivot < arr[high]) {
                high = high - 1;
            }
            if (low >= high) {
                done = true;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }

        }
        return high;
    }
    public int[] sorty(int[] arr) {
        if(arr.length < 2){
            return arr;
        }
       // int high = findPivot(arr, )
        return arr;
    }
}
