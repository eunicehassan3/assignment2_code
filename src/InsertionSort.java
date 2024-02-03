public class InsertionSort {
    public static int[] insertionSort(int[] array){
        int temp;
        for(int i = 1; i < array.length; i++){
            int j = i;
            while(j > 0 && array[j] < array[j-1]) {
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        return array;
    }
}
