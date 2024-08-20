package Operators;

public class RelationalOperators_2 {
    public static void main(String[] args) {
//        !=, Not Equal to returns true if the left-hand side is not equal to the right-hand side.
        int a = 10;
        int b = 11;
        System.out.println(a != b); // O/P: true

        int c = 12;
        int d = 12;
        System.out.println(c != d); // O/P: false

        boolean b1 = true;
        boolean b2 = true;
        System.out.println(b1 != b2); // O/P: false

        boolean b3 = true;
        boolean b4 = false;
        System.out.println(b3 !=  b4); // O/P: true

         boolean b5 = false;
         boolean b6 = false;
         System.out.println(b5 != b6); // O/P: false
    }
}
