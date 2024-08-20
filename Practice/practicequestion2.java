package Practice;

public class practicequestion2 {
   // Q2: Write a Java program to calculate the result of x = (a * b) + (a / b) - (a % b) where a = 15 and b = 4.

    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        int x = (a*b) + (a/b) - (a%b);
        System.out.println(x);
    }
}
