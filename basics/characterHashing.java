package basics;

import java.util.Arrays;
import java.util.Scanner;

public class characterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:  ");
        String str = sc.nextLine();
        int n = str.length();


        int [] hash = new int[256];
        for (int i=0; i<n; i++){
            //creating the hash for every character
            hash[(int) str.charAt(i)]++;
        }


        //Display characters based on the number of queries
        System.out.print("Enter the number of queries");
        int q = sc.nextInt();
        while(q>0){
            System.out.print("Enter the elements you want to search: ");
            char c = sc.next().charAt(0);
            //fetch
            System.out.println("Frequency of '" + c + "' is: " + hash[c]);
            q--;

        }

        //Display all the characters
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (hash[i] > 0) {
                System.out.println((char) i + " -> " + hash[i]);
            }
        }

        System.out.println(Arrays.toString(hash));

        sc.close();



    }



    
}
