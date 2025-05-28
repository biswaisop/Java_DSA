package basics;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        //create the hashmap
        //HashMap<Character, Integer> freqmap = new HashMap<>(); this doesn't store the values in the order of the input
        LinkedHashMap<Character, Integer> freqmap = new LinkedHashMap<>(); // it stores the values in the order of the input

        //HashMaps can store number in order but cant store characters in their correct ascii values so we use LinkedHashMap


        //sets the character count of each character from the string
        for (char c : str.toCharArray()){
            freqmap.put(c,freqmap.getOrDefault(c, 0)+1);
        }

        System.out.println("Character Frequencies: ");
        for (char c: freqmap.keySet()){
            System.out.println(c + "->"+ freqmap.get(c));
        }

        for (Character it:freqmap.keySet()){
            System.out.println(it);
        }

    }
}
