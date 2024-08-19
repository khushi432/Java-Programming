package Operators;

public class AssignmentOperator_2 {
//    -=, for subtracting the right operand from the left operand and then assigning it to the variable on the left.
public static void main(String[] args) {
    int a = 10;
    int b = 11;
//    System.out.println(a); // O/P:10
//    System.out.println(b); // O/P: 11

//    a = a - 1;
//      a -= 1;
//    System.out.println(a); // O/P: 9

    //    b = b - 1;
//    b -= 1;
//    System.out.println(a); // O/P: 10

    b = b - a;
    b -= a;
    System.out.println(b); // O/P: 1
}

}
