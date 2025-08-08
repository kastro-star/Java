//public class OOPS_18_exceptionhandling_withfinal_and_throwkeyword {
//    public static void main(String[] args) {
//        int a = 5;
//        int c = 0;
//        try{
//            System.out.println(a/c);
//        }
//        catch (Exception l ){
//            c= 5;
//            System.out.println("kastro  the output is creating error ");
//            //try block executed without error catch block cannot  be executed
//
//        }
//        finally {
//            System.out.println("final block is executed ");
//            //whatever it is final block is definatly be executed
//        }
//    }
//

public class OOPS_18_exceptionhandling_withfinal_and_throwkeyword {
    static void chk(int age){
        if (age<18){
            throw new ArithmeticException("age is invalid ");
        }

    }
    public static void main(String[] args) {

        try{
            chk(17);
        }
        catch (ArithmeticException i ){
            System.out.println(i.getMessage());
        }
        finally {
            System.out.println("final is also executed");
        }
    }
}