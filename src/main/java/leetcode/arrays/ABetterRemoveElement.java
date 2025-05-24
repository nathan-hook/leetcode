package leetcode.arrays;

import java.util.Arrays;

public class ABetterRemoveElement {

    public int removeElement(int[] nums, int val) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            // if not val then swap with current index.
            if (nums[i] != val) {

                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,2,3,0,4,2};

        int val = 2;

        System.out.println(Arrays.toString(nums));

        ABetterRemoveElement solution = new ABetterRemoveElement();
        int k = solution.removeElement(nums, val);

        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
