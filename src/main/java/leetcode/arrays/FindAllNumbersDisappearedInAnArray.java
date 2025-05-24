package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/

public class FindAllNumbersDisappearedInAnArray {

    // Failed due to time limit exceeded.
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//
//        List<Integer> missing = new ArrayList<>();
//
//        for (int i = 1; i <= nums.length; i++) {
//
//            boolean present = false;
//
//            for (int num : nums) {
//
//                if (i == num) {
//
//                    present = true;
//                    break;
//                }
//            }
//
//            if (!present) {
//
//                missing.add(i);
//            }
//
//        }
//
//        return missing;
//    }

    // This also failed the time limit...
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//
//        List<Integer> numbers = new ArrayList<>();
//
//        for (int i = 1; i <= nums.length; i++) {
//
//            numbers.add(i);
//        }
//
//        numbers.removeAll(Arrays.stream(nums).boxed().toList());
//
//        return numbers;
//    }

    // You had to look this solution up.
    // It makes sense once you look at it a bit.
    // https://github.com/doocs/leetcode/blob/main/solution/0400-0499/0448.Find%20All%20Numbers%20Disappeared%20in%20an%20Array/README_EN.md
    //
    // The solution involves making a new boolean Array that is one larger that the initial array (due to the numbers being 1
    // based instead of zero based).  Then you go through the initial array setting the new array's index to true for
    // each value found in the initial array.
    //
    // There are two answers that are faster than yours, but they are really weird:
    // https://leetcode.com/submissions/detail/1514984282/?from=explore&item_id=3270
    public List<Integer> findDisappearedNumbers(int[] nums) {

        boolean[] present = new boolean[nums.length + 1];

        for (int num : nums) {

            present[num] = true;
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = 1; i < nums.length + 1; i++) {

            if(!present[i]) {

                missing.add(i);
            }
        }

        return missing;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        //int[] nums = new int[]{1,1};

        System.out.println(Arrays.toString(nums));

        FindAllNumbersDisappearedInAnArray test = new FindAllNumbersDisappearedInAnArray();
        List<Integer> solution = test.findDisappearedNumbers(nums);

        System.out.println(String.join(", ", solution.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
