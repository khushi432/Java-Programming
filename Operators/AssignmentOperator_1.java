package Operators;

public class AssignmentOperator_1 {
    public static void main(String[] args) {
//        +=, for adding the left operand with the right operand and then assigning it to the variable on the left.
        int a = 10;
        int b = 11;
//        System.out.println(a); // O/P: 10
//        System.out.println(b); // o/p: 11
//
//        a = a + 10; // O/p: 20
//        a += 10; // a = a+10 O/P: 20
//        System.out.println(a); // O/P: 20

//        b = b +10; // O/p: 21
//        b +=10; // O/P: 21
//        System.out.println(b);

//        a = a + b; // a = a + 11 OR a = 10 + 11
          a += b; // a = a + b OR a = 10 + 11
        System.out.println(a); // O/P: 21

    }
}
