package leetcode.arrays;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {

        /*
        int[] squares = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for (int p=nums.length - 1; p>=0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                squares[p] = nums[i] * nums[i];
                i++;
            }
            else {
                squares[p] = nums[j] * nums[j];
                j--;
            }
        }
        return squares;
        */
        /*
        int[] squares = new int[nums.length];
        int left = 0;
        int right = nums.length -1;

        // Go from small to large?
        for (int i = nums.length - 1; i >0 ; i--) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {

                squares[i] = nums[left] * nums[left];
                left++;

            } else {

                squares[i] = nums[right] * nums[right];
                right--;
            }
        }

        return squares;
         */
        int[] squares = new int[nums.length];
        int left = 0;
        int right = nums.length -1;

        // Go from small to large?
        for (int i = squares.length - 1; i >= 0; i--) {

            if (Math.abs(nums[left]) < Math.abs(nums[right])) {

                squares[i] = nums[left] * nums[left];
                left++;

            } else {

                squares[i] = nums[right] * nums[right];
                right--;
            }
        }

        return squares;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{-4,-1,0,3,10};

        System.out.println(Arrays.toString(nums));

        Solution solution = new Solution();

        int[] squares = solution.sortedSquares(nums);

        System.out.println(Arrays.toString(squares));
    }
}