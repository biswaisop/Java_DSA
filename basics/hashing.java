package basics;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter no. : ");
            arr[i] = sc.nextInt();
        }

        int [] hash = new int[13];
        for (int i=0; i<n; i++){
            //creating the hash for every integer
            hash[arr[i]] +=1;
        }

        System.out.print("Enter the number of queries");
        int q = sc.nextInt();
        while(q>0){
            System.out.print("Enter the elements you want to search: ");
            int number = sc.nextInt();
            //fetch
            System.out.println(hash[number]);
            q--;

        }

        HashMap<Integer, Integer> freqmap = new HashMap<>();

        for (int it: arr){
            freqmap.put(it, freqmap.getOrDefault(it, 0)+1);
        }

        for (Integer it:freqmap.keySet()){
            System.out.println(it+" -> "+freqmap.get(it));
        }

        sc.close();
    }
}
