package Practice;

public class SwapTheNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b =  4;
//        Swap the number
        System.out.println("Before: a is : " +a +" and b is : "+b);
//        To swap a and b
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after : a is : " +a +" and b is : "+b);
    }
}
