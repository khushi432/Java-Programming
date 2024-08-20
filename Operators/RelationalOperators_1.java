package Operators;

public class RelationalOperators_1 {
    public static void main(String[] args) {
//        ==, Equal to returns true if the left-hand side is equal to the right-hand side.
        int a  = 10;
        int b = 11;
        System.out.println(a == b); // O/P: False

        int c = 1;
        int d = 1;
        System.out.println(c==d); // O/P: true

        // Difference b/w '=' and '=='
        int num1 = 14;
        double num2 = 14;
        System.out.println(num1==num2); //  O/P: true

        float num3 = 14.0f;
        int num4 = 14;
        System.out.println(num3==num4); // O/P: true

        boolean flag = true;
        boolean lag = false;
        System.out.println(flag==lag); // O/P: false


    }
}
