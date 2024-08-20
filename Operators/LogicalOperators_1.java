package Operators;

public class LogicalOperators_1 {
    public static void main(String[] args) {
//        &&, Logical AND: returns true when both conditions are true.
        boolean a = true; // 1
        boolean b = false; // 0
        System.out.println(a && b); // O/P: false

        boolean a1 = false; //
        boolean b1 = true; //
        System.out.println(a1 && b1); // O/P: false

        boolean a2 = false; //
        boolean b2 = false; //
        System.out.println(a2 && b2); // O/P: false

        boolean a3 = true; //
        boolean b3 = true; //
        System.out.println(a3 && b3); // O/P: true

    }
}
