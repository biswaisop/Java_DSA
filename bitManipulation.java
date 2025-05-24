public class bitManipulation {
    public static void main(String[] args) {

        //getbit -> use a bitmask to get the bit at a given position using AND operation "&"
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            System.out.println("Bit was 0");
        }
        else{
            System.out.println("Bit was 1");
        }

        //setbit -> use a bitmask to set the bit at a given position using the OR operation " | "
        n = 5;
        pos = 1;
        bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        //clearbit -> use a bitmaskto to clear a bit at a given position of a number using NOT "~" of the bti mask then AND "&" operation
        n = 5;
        pos = 2;
        bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        newNumber = notBitMask & n;
        System.out.println(newNumber);

        //updatebit -> set operation to update to 1 and clear operation to set to 0

    }
}
