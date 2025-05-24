import java.util.*;


class Firstclass {
    public static void main(String args[]) {
        //variables
        String biswa = "Biswadip";
        
        //taking input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        for(int i=0; i<=10; i++){
            System.out.printf(biswa+" and "+name+i+"\t");
        }        
    }
}