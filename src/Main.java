import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(largestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
        System.out.println(largestGap(new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}));
        System.out.println(largestGap(new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}));

    }

    public static int largestGap(int[] array) {
        // sort array if not already sorted
        Arrays.sort(array);
        int gap = 0;

        for(int i = 1; i < array.length; i++) {
            int g = array[i] - array[i-1];

            if (g > gap) {
                gap = g;
            }
        }
        return gap;
    }
}

