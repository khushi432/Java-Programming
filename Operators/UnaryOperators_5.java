package Operators;

public class UnaryOperators_5 {
    public static void main(String[] args) {
//        ! : Logical not operator, used for inverting a boolean value.
//        It means if you give 0 to this operator this operator will gives you 1 or vice versa
        boolean a = true;
        boolean b = false;
//        System.out.println(a); //O/P: true
//        System.out.println(b); // O/P: false

        System.out.println(!a); // O/P: false
        System.out.println(!b); // O/P: true


//        use case
//        boolean underAge = true;
//        if(!underAge){
//            System.out.println("Aap abhi bacche ho");
//        }else{
//            System.out.println("Buddha hogya hai ");
//        }
//          Before !
//        If True : o/p: Aap abhi bacche ho
//        If false: o/p: Buddha hogya hai

//  After
//        if true:  Buddha hogya hai
//          if false: Aap abhi bacche ho



    }
}
