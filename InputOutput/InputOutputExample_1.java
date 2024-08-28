package InputOutput;

import java.util.Scanner; // Step-1

public class InputOutputExample_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Setp-2

        // Prompt the user to enter an integer value
//        System.out.print("Enter the value of a : ");
//        int a = sc.nextInt();
//        System.out.println("O/P: "+(a+1));

//        Enter a float value
//        System.out.print("Enter a float value: ");
//        float dog = sc.nextFloat();
//        System.out.println(dog);

////        Double
//        System.out.println("Enter a double value ");
//        double  sun = sc.nextDouble();
//        System.out.println(" RING AROUND ROSES: " +sun);

//        Gender
//        System.out.print("Enter your gender: ");
//        char gender = sc.next().charAt(0);
//        System.out.println(gender);

//        Name
        System.out.print(" Enter your  name : ");
        String name = sc.nextLine();
        System.out.println("My name is "+name);
        




    }
}
