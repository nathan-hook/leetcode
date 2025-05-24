package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
// This answer ended up being one of the fastest java submissions. Woo-hoo.
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length - k; i++) {

            if (nums[i] == val) {

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

        //int[] nums = new int[]{0,1,2,2,3,0,4,2};
        //int[] nums = new int[]{2,2,2,2,2,2};
        //int val = 2;

        //int[] nums = new int[]{3,2,2,3};
        //int val = 3;

        int[] nums = new int[0];
        int val = 0;

        System.out.println(Arrays.toString(nums));
        
        RemoveElement removeElement = new RemoveElement();
        int k = removeElement.removeElement(nums, val);

        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
