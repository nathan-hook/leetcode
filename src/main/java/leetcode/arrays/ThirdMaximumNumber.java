package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/

// YOU HATE YOUR ANSWER!  The calculation of the if min used and uniqueCount drove you nuts!
//
// Some answers use a double and Long.MIN_VALUE instead of Integer.MIN_VALUE.  Which is a smarter solution than
// what you decided to do below.
// https://github.com/doocs/leetcode/blob/main/solution/0400-0499/0414.Third%20Maximum%20Number/README_EN.md
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;

        int uniqueCount = 0;
        boolean minIntUsed = false;

        for (int num : nums) {

            if (num == Integer.MIN_VALUE && !minIntUsed) {

                minIntUsed = true;
                uniqueCount++;
            }

            if (num == m1 || num == m2 || num == m3) {

                // ignore

            } else if (num > m1) {

                m3 = m2;
                m2 = m1;
                m1 = num;
                uniqueCount++;

            } else if (num > m2) {

                m3 = m2;
                m2 = num;
                uniqueCount++;

            } else if (num > m3) {

                m3 = num;
                uniqueCount++;
            }
        }

        if ((uniqueCount >= 3) && (m3 != Integer.MIN_VALUE || minIntUsed)) {

            m1 = m3;
        }

        return m1;
    }

    public static void main(String[] args) {

        //int[] nums = new int[]{2,2,3,1,5};
        //int[] nums = new int[]{1,2,2,5,3,5};
        //int[] nums = new int[]{1,-2147483648,2};
        //int[] nums = new int[]{-2147483648,1,1};
        int[] nums = new int[]{-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
        //int[] nums = new int[]{5,2,2};

        System.out.println(Arrays.toString(nums));

        ThirdMaximumNumber solution = new ThirdMaximumNumber();
        int max = solution.thirdMax(nums);

        System.out.println(max);
    }
}
