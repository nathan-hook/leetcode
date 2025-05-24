package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
// This solution ended up being quite efficient.
public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int zeros = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                zeros++;

            } else {

                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = zeros; i > 0; i--) {

            nums[nums.length - i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,0,3,12};
        //int[] nums = new int[]{2,1};

        System.out.println(Arrays.toString(nums));

        MoveZeros solution = new MoveZeros();
        solution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
