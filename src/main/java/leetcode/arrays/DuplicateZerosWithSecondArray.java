package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
// I am unsure if I like this answer since the question does state:
// QUOTE:
// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//
// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
//
// I feel like that specifically says, make the modifications directly to the original array without a second array.
//
// Explanation of what is happening.
// Since it is computationally expensive to move values in an array (O(n) x a certain number of zeros up to half of the array length).
// To avoid going over the array multiple times, we just go over the arr array once and calculate new zeros to add as needed.
public class DuplicateZerosWithSecondArray {

    public void duplicateZeros(int[] arr) {

        int arrPosition = 0;
        int destinationPosition = 0;

        int[] destinationArray = new int[arr.length];

        while (destinationPosition < arr.length) {

            destinationArray[destinationPosition] = arr[arrPosition];
            destinationPosition++;

            if (arr[arrPosition] == 0) {

                destinationPosition++;
            }
            arrPosition++;
        }

        System.arraycopy(destinationArray, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,0,2,3,0,4,5,0};

        System.out.println(Arrays.toString(arr));

        DuplicateZerosWithSecondArray duplicateZeros = new DuplicateZerosWithSecondArray();
        duplicateZeros.duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}