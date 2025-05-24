package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
//
// This is an interesting problem.  When reading the conclusion of Arrays it implies that there is a way of
// using an array in a circular way:
// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3220/
// I was unable to figure out how to use the array in a circle.  However, I couldn't figure it out.  I ended up
// having to look up how to do a bubble sort.  I was close on my own, but I had to look up the do/while loop.
//
// Some really fast answers use what is called a bucket sort:
// https://leetcode.com/submissions/detail/1506468471/?from=explore&item_id=3228
public class HeightChecker {

    public int heightChecker(int[] heights) {

        //int[] orderedHeights = new int[heights.length];

        int unexpected = 0;

        int pointer = 0;

        // Left to right sort.  Small to large.
//        for (int i = 0; i < heights.length - 1; i++) {
//
//            if (heights[i] > heights[i + 1]) {
//
//                int temp = heights[i + 1];
//                heights[i + 1] = heights[i];
//                heights[i] = temp;
//            }
//        }

        // Trying a bubble sort from the interwebs:
        // https://stackoverflow.com/a/8938297

        boolean swapped = true;
        int j = 0;

        while (swapped) {

            swapped = false;
            j++;

            for (int i = 0; i < heights.length - j; i++) {

                if (heights[i] > heights[i + 1]) {

                    int temp = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println(Arrays.toString(heights));
        }

        System.out.println(j);
        System.out.println(Arrays.toString(heights));

        return j;
    }

    public static void main(String[] args) {

        //int[] heights = new int[]{1,1,4,2,1,3};
        int[] heights = new int[]{5,1,2,3,4};
        //int[] heights = new int[]{1,2,3,4,5};


        System.out.println(Arrays.toString(heights));

        HeightChecker solution = new HeightChecker();
        int output = solution.heightChecker(heights);

        System.out.println(output);
    }
}
