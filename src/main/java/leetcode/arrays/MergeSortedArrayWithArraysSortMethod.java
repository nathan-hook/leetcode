package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
// While this answer isn't the fastest answer due to the resorting of the nums1 array, it is a super simple answer.
// We file all the zero values in the nums1 array with all the values in the nums2 array and then sort the nums1 array.
public class MergeSortedArrayWithArraysSortMethod {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {

            nums1[m] = nums2[i];
            m++;
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{2,5,6,0,0,0};
        int m = 3;

        int[] nums2 = new int[]{1,2,3};
        int n = 3;

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        MergeSortedArrayWithArraysSortMethod mergeSortedArray = new MergeSortedArrayWithArraysSortMethod();
        mergeSortedArray.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
