package DSA;
import java.util.Arrays;

public class BubbSort {

    // Proper Bubble sort implementation
    static void Bubbsort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 2, 1, 4, 5, 5, 5, 6, 3, 65, 7, 57, 9, 0};
        Bubbsort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
