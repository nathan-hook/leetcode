package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] tempArray = new int[nums1.length];
        int tempPosition = nums1.length -1;

        while (m > 0 || n > 0) {

            // Problem we can't go into negative numbers, so we must check to see if m or n is already zero.
            // Then, use the other number, else, check which number is higher.

            if (m == 0) {

                tempArray[tempPosition] = nums2[n - 1];
                n--;

            } else if (n == 0) {

                tempArray[tempPosition] = nums1[m - 1];
                m--;

            } else {

                if (nums1[m - 1] > nums2[n - 1]) {

                    tempArray[tempPosition] = nums1[m - 1];
                    m--;

                } else {

                    tempArray[tempPosition] = nums2[n - 1];
                    n--;
                }
            }
            tempPosition--;
        }

        System.arraycopy(tempArray, 0, nums1, 0, nums1.length);
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{2,5,6,0,0,0};
        int m = 3;

        int[] nums2 = new int[]{1,2,3};
        int n = 3;

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
