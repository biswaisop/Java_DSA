public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Tony");
        System.out.println(str);

        //chat at index 0
        System.out.println(str.charAt(0));

        //set character at index
        str.setCharAt(0, 'p');
        System.out.println(str);

        //insert
        str.insert(0, "p"); //ppony
        System.out.println(str);

        //delete the extra p
        str.delete(0,1);
        System.out.println(str);

        //append
        str.append("looe");
        System.out.println(str);

        //reverse a string (logical)
        for (int i = 0; i < str.length()/2; i++) {
            char frontChar = str.charAt(i);
            char backChar = str.charAt(str.length()-i-1);

            str.setCharAt(str.length()-i-1, frontChar);
            str.setCharAt(i, backChar);

        }
        System.out.println(str);

        //reverse by methods
        str.reverse();
        System.out.println(str);

    }
}