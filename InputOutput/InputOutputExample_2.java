package InputOutput;

//        Step-1;
import java.util.Scanner;

public class InputOutputExample_2 {
    public static void main(String[] args) {
//        Step-2
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd num: ");
        int b  = sc.nextInt();

        System.out.println("Sum is : "+ (a+b));

    }
}
