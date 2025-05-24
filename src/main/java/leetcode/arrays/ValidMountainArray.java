package leetcode.arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        boolean valid = false;
        boolean increasing = true;
        boolean decreasing = false;

        if (arr.length > 2) {

            for (int i = 0; i < arr.length; i++) {

                if (increasing) {

                    if (i == arr.length - 1) {

                        increasing = false;

                    } else if (arr[i] < arr[i + 1]) {

                    } else if (i >= 1 && arr[i] > arr[i + 1]) {

                        increasing = false;
                        decreasing = true;

                    } else {
                        increasing = false;
                    }
                }

                if (decreasing) {

                    if (i == arr.length - 1) {

                        valid = true;

                    } else if (arr[i] > arr[i + 1]) {

                    } else {

                        decreasing = false;
                    }
                }
            }
        }

        return valid;
    }

    public static void main(String[] args) {

        //int[] arr = new int[]{2,1};
        //int[] arr = new int[]{3,5,5};
        //int[] arr = new int[]{0,3,2,1};
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};

        ValidMountainArray validMountainArray = new ValidMountainArray();

        boolean valid = validMountainArray.validMountainArray(arr);

        System.out.println(valid);
    }
}
