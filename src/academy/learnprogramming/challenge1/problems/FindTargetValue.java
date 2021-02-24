package academy.learnprogramming.challenge1.problems;

import java.util.Arrays;

public class FindTargetValue {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8};
        int[] arr2 = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8};
        //System.out.println(Arrays.toString());
      //  findTarget(arr1,arr2, 6);
        findTarget(arr1,arr2, arr1.length, arr2.length, 6);



    }

    //for given arrays find all elements which make 6
    public static void findTarget(int[] arr1, int[] arr2, int target){
        if (arr1.length != arr2.length){
            System.out.println("Provide arrays with same length: ");
            return;
        }
        for (int i = 0; i < arr1.length; i ++){
            for (int k = 0; k < arr2.length; k++){
                if(arr1[i] + arr2[k] == target){
                    System.out.println(i + "+" + k + "=" + target);
                }
            }
        }

    }

    public static void findTarget(int[] arr1, int[] arr2, int arr1Len, int ar2Len, int target){
        int a = arr1Len - 1;
        int b = ar2Len;

        if(arr1.length != arr2.length || a < 1){
           // System.out.println("a:" + a + " b:" + ar2Len + " return");
            return;
        }

        while (b > 0){
            if(arr1[a] + arr2[b - 1] == target){
                System.out.println(a + "+" + (b - 1) + "=" + target);
            }
            b--;
        }
        findTarget(arr1, arr2, a, ar2Len, target);
    }


}
