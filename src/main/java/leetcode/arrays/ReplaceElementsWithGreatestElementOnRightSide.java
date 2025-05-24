package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
// You kind of like this answer, but you knew that something was off, and it was because there is a specific
// direction you're supposed to go.  We're worried about the HIGHEST to the RIGHT.  So go right to left instead of
// left to right in the array.
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int greatestOnRight = -1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > greatestOnRight && arr[j] != 0) {

                    greatestOnRight = arr[j];
                }
            }

            if (greatestOnRight == -1) {

                arr[i] = greatestOnRight;
                i = arr.length;
             } else {
                arr[i] = greatestOnRight;
            }
        }

        return arr;
    }



    public static void main(String[] args) {

        int[] arr = new int[]{4,0,0};
        //int[] arr = new int[]{17,18,5,4,6,1};

        System.out.println(Arrays.toString(arr));

        ReplaceElementsWithGreatestElementOnRightSide solution = new ReplaceElementsWithGreatestElementOnRightSide();

        arr = solution.replaceElements(arr);

        System.out.println(Arrays.toString(arr));
    }
}
