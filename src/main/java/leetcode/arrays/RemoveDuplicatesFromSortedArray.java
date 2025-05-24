package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
// I do not know how this compared to the other answers, I didn't get a marker on the graph.

// Some people did some interesting things here, they would start at the second position (1) and then compare
// to the value prior i - 1 (0) and then set the value with the value to the right.
// These answers had to do a nums.length == 0 check at the beginning of the method.

// Other folks use a HashSet to get all unique values.
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length - 1 - k; i++) {

            if (nums[i] == nums[i + 1]) {

                for (int j = i; j < nums.length - 1; j++) {

                    nums[j] = nums[j + 1];
                }
                i--;
                k++;
            }
        }

        return nums.length - k;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(nums));

        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        int k = solution.removeDuplicates(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
