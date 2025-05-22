import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // one-D arrays
//        int [] marks = new int[3]; // first method to define an array
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 99;
//        System.out.println(marks);, will print some value that wil have the mixture of class name and hash codes
//        int[] nums = {1,2,3,4,}; // second method to define an array
//
//        taking size input from user
        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int  [] numbers = new int[size];
//
//        for(int i = 0; i < size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        for(int i = 0; i < size; i++){
//            System.out.println(numbers[i]);
//        }
//
        //2-d arraus
        System.out.print("Enter the number of rows: ");int rows = sc.nextInt();
        System.out.print("Enter the number of rows: ");int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
