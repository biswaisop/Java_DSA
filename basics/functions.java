import java.util.Scanner;

public class functions {
    public static int add2Num(int a, int b){
        return a + b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");int a = sc.nextInt();
        System.out.print("Enter b: ");int b  = sc.nextInt();
        sc.close();
        int sum = add2Num(a,b);
        System.out.println("Sum: " + sum);
    }
}
