import java.util.*;



public class inputExamle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // ✅ Create once

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read a full line

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read an integer

        System.out.print("Enter your height in meters: ");
        float height = sc.nextFloat();  // Read a float

        System.out.println("\nSummary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");

        sc.close();  // ✅ Close once, after all inputs are done
    }
}
