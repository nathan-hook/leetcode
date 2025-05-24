package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                // move everything else right...
                for (int j = arr.length - 1; j > i; j--) {

                    arr[j] = arr[j -1];
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,0,2,3,0,4,5,0};

        System.out.println(Arrays.toString(arr));

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}