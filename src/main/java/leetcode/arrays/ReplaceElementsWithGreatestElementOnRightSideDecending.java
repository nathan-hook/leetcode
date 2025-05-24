package leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
public class ReplaceElementsWithGreatestElementOnRightSideDecending {

    public int[] replaceElements(int[] arr) {

        int greatestOnRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            int current = arr[i];
            arr[i] = greatestOnRight;
            greatestOnRight = Math.max(greatestOnRight, current);
        }

        return arr;
    }



    public static void main(String[] args) {

        //int[] arr = new int[]{4,0,0};
        int[] arr = new int[]{17,18,5,4,6,1};

        System.out.println(Arrays.toString(arr));

        ReplaceElementsWithGreatestElementOnRightSideDecending solution = new ReplaceElementsWithGreatestElementOnRightSideDecending();

        arr = solution.replaceElements(arr);

        System.out.println(Arrays.toString(arr));
    }
}
