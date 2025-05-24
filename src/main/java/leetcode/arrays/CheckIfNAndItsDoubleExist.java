package leetcode.arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
// You do like your answer, but there is an answer that uses a HashSet that has you intrigued.

// Give that a try later.
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {

        boolean test = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j) {
                    if (compare(arr[i], arr[j])) {

                        test = true;
                        j = arr.length;
                        i = arr.length;
                    }
                }
            }
        }
        return test;
    }

    private boolean compare(int a, int b) {

        boolean test = false;

        if (a == (2 * b)) {

                test = true;
            }

        return test;
    }

    public static void main(String[] args) {

        //int[] arr = new int[]{10,2,5,3};
        //int[] arr = new int[]{3,1,7,11};
        int[] arr = new int[]{0,0};

        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        boolean exists = checkIfNAndItsDoubleExist.checkIfExist(arr);

        System.out.println(exists);
    }
}
