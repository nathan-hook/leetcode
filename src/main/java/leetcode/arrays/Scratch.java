package leetcode.arrays;

public class Scratch {

    public static void main(String[] args) {

        System.out.println(countDigits(-1));
    }

    private static int countDigits(int num) {

        System.out.println(num);
        int count = 0;

        int result = num / 10;
        if (result > 0) {

            count = countDigits(result);
            System.out.println(count);
        }

        return ++count;
    }
}
