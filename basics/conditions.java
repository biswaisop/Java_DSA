import java.util.*;

public class conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Printer.p("Enter Your age: ");
        int age = sc.nextInt();

        sc.close();

        if (age < 18) {
            Printer.pl("Not an adult");
        } else if (age>18 && age<60){
            Printer.pl("Adult but not a senior citizen");
        }
        else{
            Printer.pl("Senior Citizen");
        }
    }
}
