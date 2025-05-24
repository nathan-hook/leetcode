package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
// Interesting, this link is different from the other RemoveDuplicatesFromSortedArray class, but the code was
// already preloaded.

// Can you do this without a second for loop?
// The answer is yes, yes you can.  Interesting note, you attempt to do your solutions like you state them out loud,
// but you really need to watch what you're doing with your mouse when you talk through your solutions.

// Come to find out this is called "the two pointer technique".  Your read pointer (from the for loop) and the
// write pointer which is the variable.
public class ABetterRemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int currentLocation = 0;

        if (nums.length != 0) {

            currentLocation = 1;

            for (int i = 1; i < nums.length; i++) {

                if (nums[i] > nums[i - 1]) {

                    nums[currentLocation] = nums[i];
                    currentLocation = currentLocation + 1;
                }
            }
        }

        return currentLocation;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        //int[] nums = new int[]{1,1,2};
        //int[] nums = new int[]{};

        System.out.println(Arrays.toString(nums));

        ABetterRemoveDuplicatesFromSortedArray solution = new ABetterRemoveDuplicatesFromSortedArray();
        int k = solution.removeDuplicates(nums);

        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
