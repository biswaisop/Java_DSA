package DSA.sorting;

import java.util.Arrays;

public class selectSort {
    static void sort(int arr[], int n){
        for(int i = 0; i < n-1; i++){
            int mini = i;
            for(int j = i+1; j < n; j++){
                if(arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr [i] = arr[mini];
            arr[mini] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr = {67,89,23,56,88,65,9,34,56};
        System.out.println(Arrays.toString(arr));
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
