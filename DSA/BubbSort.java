package DSA;

public class BubbSort {

    //Bubble sort
    public static void Bubbsort(int [] a){
        for (int i = 0; i < a.length; i++){
            if (a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {3,2,4,2,1,4,5,5,5,6,3,65,7,57,9,0};
        Bubbsort(nums);
        System.out.println(nums);
    }


}
