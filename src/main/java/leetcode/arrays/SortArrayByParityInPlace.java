package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
// You don't know quite what to think about this answer.  This is super similar the answer that ran the fastest on
// leetcode.
// Run this code through the debugger to completely figure out what is happening.
// GOT IT!
// Keep an index of where you are (index).  Then look for the first even number.  Switch the even number with the
// (odd) number at index.
public class SortArrayByParityInPlace {

    public int[] sortArrayByParity(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            // if even switch with current index which must be odd.
            if (nums[i] % 2 == 0) {

                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{3,1,2,4};

        System.out.println(Arrays.toString(nums));

        SortArrayByParityInPlace solution = new SortArrayByParityInPlace();
        nums = solution.sortArrayByParity(nums);

        System.out.println(Arrays.toString(nums));
    }
}
