package academy.learnprogramming.challenge1.sorting;

import java.util.Arrays;

public class MergeEx {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

   public static void mergeSort(int[] arr, int start, int end){
        //divide - split
       if(end - start < 2){
           return;
       }

       int middle = (start + end)/2;
       mergeSort(arr, start, middle);
       mergeSort(arr, middle, end);
       merge(arr, start, middle, end);
   }

   private static void merge(int[] arr, int start, int midl, int end){


        int[] temp = new int[end - start];
        int t = temp.length -1;
       int m = midl -1;
       int e = end - 1;

        while (t >= 0){
            temp[t--] = e < midl || (m >= start && arr[m] > arr[e]) ?arr[m--]:arr[e--];
        }

        System.arraycopy(temp, 0, arr, start, temp.length);
   }
}
