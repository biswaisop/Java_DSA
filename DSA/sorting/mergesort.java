package DSA.sorting;

import java.util.Arrays;

public class mergesort {
    public void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) { // comparing the elements of the two arrays starting from the 1st array position
            } else {
                temp[index++] = arr[right++];
            }
        }
        // copy the remaining elements from the left array to the temp array
        while (left <= mid) {
            temp[index++] = arr[left++];
        }
        // copy the remaining elements from the right array to the temp array
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy sorted temp back to original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public void sort(int[] arr, int low, int high){
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(arr, low, mid);//recursive sorting the left array
        sort(arr, mid + 1, high);//recursive sorting the right array
        merge(arr, low, mid, high); //merging the sorted array
    }

    public static void main(String[] args) {
        int[] arr = {67, 89, 23, 56, 88, 65, 9, 34, 56};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        mergesort ms = new mergesort();
        ms.sort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
