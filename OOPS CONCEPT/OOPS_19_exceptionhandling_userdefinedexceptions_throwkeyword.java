class userdefinedexception extends Exception{
    String str;
    public userdefinedexception(String str){
        super(str);
    }
}
public class OOPS_19_exceptionhandling_userdefinedexceptions_throwkeyword {
    static void check(int age) throws userdefinedexception,ArithmeticException {
        if (age < 18) {
            throw new userdefinedexception("hjgj");
        } else {
            throw new ArithmeticException("hrtrt");
        }
    }
    public static void main(String[] args) {

        try{
            check(17);
            System.out.println("hii");
        }
        catch (ArithmeticException E){
            System.out.println("catch block");
        }
        catch (userdefinedexception i ){
            System.out.println("is executed");
        }
        finally {
            System.out.println("final block executed");
        }
    }

}
