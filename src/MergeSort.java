public class MergeSort implements SortingAlgorithm{
    public int[] sorty(int[] arr){
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
        left = sorty(left);
        right = sorty(right);

        return merge(left, right);

    }

    public int[] merge(int[] left, int[] right){
        int l = 0; //left index
        int r = 0; //right index
        int index = 0; //result index;
        int[] result = new int[left.length + right.length];

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                result[index] = left[l];
                index++;
                l++;
            } else {
                result[index] = right[r];
                index++;
                r++;
            }
        }

        while (l < left.length) {
            result[index] = left[l];
            index ++;
            l++;
        }

        while (r < right.length) {
            result[index] = right[r];
            index++;
            r++;
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
