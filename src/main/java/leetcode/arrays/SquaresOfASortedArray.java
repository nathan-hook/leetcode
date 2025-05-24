package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3574/
//
// Initial notes:
// The initial array is sorted left to right from lowest to highest.
// The resulting array is also needs to be sorted from left to right from lowest to highest.
//
// Initial Solution:
// Square each number in place and then use Arrays.sort?
// The initial solution worked just fine, a bit slow compared to the fastest answers.
//
// Faster Solution:
// You'll need to use two pointers one for the left and right sides of the initial array.
// This solution is weird because you are using Math.abs, and we're looking for the larger of the two values at the
// left and right ends of the array AND we want the resulting array sorted from left to right, lowest to highest.
// Since we're looking at the largest numbers first (because we're moving from out to in) on the initial array, we
// need to fill the resulting array from right to left.  Largest values first, on the right, to the lowest values, on
// the left.  Which causes the resulting array index calculation, a bit funky.
public class SquaresOfASortedArray {

    // Initial Solution using Arrays.sort().
//    public int[] sortedSquares(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//
//            nums[i] = nums[i] * nums[i];
//        }
//
//        Arrays.sort(nums);
//
//        return nums;
//    }

    // Two pointer solution.
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int[] squared = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {

                squared[nums.length - 1 - i] = nums[left] * nums[left];
                left++;

            } else {

                squared[nums.length - 1 - i] = nums[right] * nums[right];
                right--;
            }
        }

        return squared;
    }

    public static void main(String[] args) {

        //int[] nums = new int[]{-4,-1,0,3,10};
        int[] nums = new int[]{-7,-3,2,3,11};

        System.out.println(Arrays.toString(nums));

        SquaresOfASortedArray test = new SquaresOfASortedArray();
        int[] solution = test.sortedSquares(nums);

        System.out.println(Arrays.toString(solution));
    }
}
