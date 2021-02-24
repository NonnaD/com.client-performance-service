package academy.learnprogramming.challenge1;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8};
        int[] arr2 = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8};
        int[] arr3 = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8,5};
        int[] arr4 = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8,5};
      //  Arrays.stream(bubbleSort(arr)).forEach(elem -> System.out.print(elem + ","));
        System.out.println();
      //  Arrays.stream(selectionSort(arr2)).forEach(elem -> System.out.print(elem + ","));
        System.out.println();
        Arrays.stream(insertionSort(arr3)).forEach(elem -> System.out.print(elem + ","));
        System.out.println();
       // Arrays.stream(quickSort(arr3)).forEach(elem -> System.out.print(elem + ","));
    }

    //stable On2 worst and best - quadratic time complexity
    public static int[] bubbleSort(int[] arr){
        for(int lastUnsorted = arr.length - 1; lastUnsorted > 0; lastUnsorted--){
            for(int k = 0; k < lastUnsorted; k++){
                if(arr[k] > arr[k + 1]){
                    //swapElements(arr, k, k+1);
                }
            }
        }
        return arr;
    }

    //Selection Sort is not stable because it swaps non-adjacent elements.
    //On2 quadratic best and worst case
    public static int[] selectionSort(int[] arr){
        for(int lastUnsorted = arr.length -1; lastUnsorted>0; lastUnsorted--){
            int maxElem = 0;
            int k;
            for(k = 1; k < lastUnsorted; k++){
                if(arr[k] > arr[maxElem]){
                    maxElem = k;
                }
            }
           // swapElements(arr, maxElem, k);
        }
        return arr;
    }

    //Unstable On2 worst On best
    public static int[] insertionSort(int[] arr) {
        for (int firstUnsorted = 1; firstUnsorted < arr.length; firstUnsorted++){
            int myElem = arr[firstUnsorted];
            int k;
            for (k = firstUnsorted; k > 0 && arr[k - 1] >= myElem; k--){
                arr[k] = arr[k-1];
            }
            arr[k] = myElem;
        }

        return arr;
    }
}
