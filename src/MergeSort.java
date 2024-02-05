public class MergeSort {
    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }

    public static int[] merge(int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        // Compare elements from left and right arrays and merge them into the result array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array, if any
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy remaining elements from right array, if any
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    }
//        int index1 = 0;
//        int index2 = 0;
//        int[] res = new int[left.length + right.length];
//        for(int i = 0; i < (left.length  + right.length); i++){
//            if(left[index1] < right[index2]){
//                res[i] = left[index1];
//                index1++;
//            } else {
//                res[i] = right[index2];
//                index2++;
//            }
//        }
//        return res;
//    }
//}
