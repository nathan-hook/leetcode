package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
// This question is interesting because it is under the 'In-Place Operations' leetcode card, but it doesn't
// specifically state that you need to do the operations in-place...  Try doing this with a second array...

// This solution was pretty good.  But it still wasn't the fastest.
//
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        int[] sorted = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {

                sorted[evenIndex] = nums[i];
                evenIndex++;

            } else {

                sorted[oddIndex] = nums[i];
                oddIndex--;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{3,1,2,4};

        System.out.println(Arrays.toString(nums));

        SortArrayByParity solution = new SortArrayByParity();
        nums = solution.sortArrayByParity(nums);

        System.out.println(Arrays.toString(nums));
    }
}
