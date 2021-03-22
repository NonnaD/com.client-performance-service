package com.my.interview.challange;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        //1.Merge 2 arrays
        Arrays.toString(merge(new int[]{2,3,4,1}, new int[]{3,4,5,2}));

        //2. Find average of subarray of given size
        Arrays.toString(averageOfSubarrayOfSizeK(new int[]{1,2,3,4,6,5,3,4,5,3,4,3,4}, 5));
        Arrays.stream(averageOfSubarrayOfSizeKSlidingWindow(new int[]{1,2,3,4,6,5,3,4,5,3,4,3,4}, 5));//.forEach(a -> System.out.print(a + ", "));

        //3. Find maximum sum of subarray of given size - sliding approach
        //System.out.println((maxOfSubarrayOfSizeK(new int[]{1,2,3,4,6,5,3,4,5,3,4,3,4}, 4)));
        //System.out.println((maxOfSubarrayOfSizeKSlidingApproach(new int[]{1,2,3,4,6,5,3,4,5,3,4,3,4}, 4)));

        //4.find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
       // Arrays.stream(smallestSubarraySum(new int[]{2, 1, 5, 2, 3, 2}, 8)).forEach(System.out::println);

        System.out.println(smallestSubarraySum(new int[]{1,2,3,4,1,2,3,5}, 8));
    }

    /**
     * Given an array of positive numbers and a positive number ‘S’
     * find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
     * Return 0 if no such subarray exists.
     *
     * Input: [2, 1, 5, 2, 3, 5, 2], s=7
     * Output: 2
     * Explanation: The smallest subarray with a sum greater than or equal to '7' is [5, 2].
     */
    public static int smallestSubarraySum(int[] arr, int s){
        int minArrayLength = arr.length;
        int start = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++){
            if(sum < s) sum+=arr[i];
            /**
             * once we found array with sum > s we should subtract from start to see how small it can be
             * ex: s = 8 [2,2,1,1,7] this is > s but if we remove last 7 it will be < s
             * we need to check if we have elements at the start that can be removed and still satisfy the result
             * after removing first elements we left with array [1,7] which still works fo us
             * That's why I used while here instead of if
             * */
            while(sum >= s) {
                minArrayLength = Math.min(minArrayLength, i - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return minArrayLength;
    }

    /**
     *  Sliding window approach
     *  Given an array of positive numbers and a positive number ‘k,’
     *  find the maximum sum of any contiguous subarray of size ‘k’.
     *
     * Subtract the element going out of the sliding window, i.e., subtract the first element of the window.
     * Add the new element getting included in the sliding window, i.e., the element coming right after the end of the window.
     */
    //1,2,3,4,6,5,3,4,5,3,4,3,4
    public static int maxOfSubarrayOfSizeKSlidingApproach(int[] arr, int k) {
        int max = 0, windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                max = Math.max(max, windowSum);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        return max;
    }

    /**
     *  Given an array of positive numbers and a positive number ‘k,’
     *  find the maximum sum of any contiguous subarray of size ‘k’.
     */
    public static int maxOfSubarrayOfSizeK(int[] arr, int k){
        int max = 0;
        for (int i = 0; i < arr.length - k; i++){
            int sum = 0;
            for (int j = k; j > 0; j--){
                sum += arr[i + j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static double[] averageOfSubarrayOfSizeKSlidingWindow(int[] arr, int k){
        double[] avg = new double[arr.length - k + 1];
        int al = avg.length -1;
        int windowStart = 0;
        double windowSum = 0;
        for (int i = 0; i < arr.length; i++){
            windowSum += arr[i];
           if(i > k - 1){
               avg[al--] = windowSum/k;
               windowSum -= arr[windowStart];
               windowStart++;
           }
        }
        return avg;
    }


    /**
     *  Find average of subarray of given size - regular way
     */
    public static double[] averageOfSubarrayOfSizeK(int[] arr, int k){
        double[] avg = new double[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++){
            double sum = 0;
            for (int j = i; j < i + k; j++){
                sum = sum + arr[j];
            }
            avg[i] = sum/k;
        }
        return avg;
    }

    public static int[] merge(int[] ar1, int[] ar2){
        int[] temp = new int[ar1.length + ar2.length];
        int a = ar1.length - 1;
        int b = ar2.length -1;
        int t = temp.length;

        while (t-- > 0){
            temp[t] = b < 0 || a>=0?ar1[a--]:ar2[b--];
        }
        return temp;
    }
}
