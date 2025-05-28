package basics;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //System.out.print("Enter Your Name: ");String name2 = sc.next();
    //System.out.println("My name is "+name2);
    //String manipulation functions


    //Concatenation -> joins two strings
    String FirstName = "Tony";
    String LastName = "StarK";
    String FullName = FirstName + " " + LastName;
    System.out.println(FullName);

    //Length -> gives the length of the function
    System.out.println(FullName.length());

    //charAt -> gives the character present at the passed index
    for (int i = 0; i<FullName.length(); i++){
        System.out.println(FullName.charAt(i));

    }

    //Comparison -> compares two strings, returns +ve value if s1>s2, 0 if s1==s2, -ve value if s2<s2 on the basis of length
    String string1 = "tony";
    String string2 = "stark";
    if (string1.compareTo(string2) == 0){
        System.out.println("Equal");
    }
    else{
        if (string1.compareTo(string2) >= 0){
            System.out.println("s1 is greater");
        }
        else{
            System.out.println("s2 is greater");
        }
    }

    // substring -> returns a substring of given beginning index and ending index
    String newString = "My name is Tony Statk";
    String Name = newString.substring(11, newString.length());
    System.out.println(Name);





    }

}
