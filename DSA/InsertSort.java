package DSA;

import java.util.Arrays;

public class InsertSort {
    static void sort(int arr[], int n){
        for (int i = 0; i < n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {67,89,23,56,88,65,9,34,56};
        System.out.println(Arrays.toString(arr));
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
