// Main.java
public class Main {
    public static void main(String[] args) {

        int[] example1 = {1, 2, 3, 4, 5, 6};
        System.out.println("sumOfEvens(example1) = " + ArrayUtils.sumOfEvens(example1)); // 12

        int[] example2 = {2, 2, 2};
        System.out.println("countOccurrences(example2, 2) = " + ArrayUtils.countOccurrences(example2, 2)); // 3

        // Edge cases to test
        int[] empty = {};
        int[] single = {7};
        int[] negatives = {-4, -3, -2, -1, 0};
        int[] allEqual = {5, 5, 5, 5};

        System.out.println("\n--- Edge Cases ---");
        System.out.println("sumOfEvens(null) = " + ArrayUtils.sumOfEvens(null)); // 0
        System.out.println("sumOfEvens(empty) = " + ArrayUtils.sumOfEvens(empty)); // 0
        System.out.println("sumOfEvens(single) = " + ArrayUtils.sumOfEvens(single)); // 0
        System.out.println("sumOfEvens(negatives) = " + ArrayUtils.sumOfEvens(negatives)); // -6
        System.out.println("sumOfEvens(allEqual) = " + ArrayUtils.sumOfEvens(allEqual)); // 0

        System.out.println("\ncountOccurrences(null, 5) = " + ArrayUtils.countOccurrences(null, 5)); // 0
        System.out.println("countOccurrences(empty, 5) = " + ArrayUtils.countOccurrences(empty, 5)); // 0
        System.out.println("countOccurrences(allEqual, 5) = " + ArrayUtils.countOccurrences(allEqual, 5)); // 4
    }
}
