public class OOPS_1_Methods {
    public static void main(String[] args) {
        System.out.println(add(4,6));
        System.out.println("output verified");
    }
    /*
    public static void add(){   // void its a return type and datatype of output  --- add is a method name(function name)
        //its an void function without parameters and return type
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);



        public static void add(int a ,int b) {
            //its an void function with parameters and return type
            int c = a + b;
            System.out.println(c);
        }
*/

        // it is an non void parametrized function
        public static int add(int a ,int b){
            int c = a+b;
            return c;     //why return type was used because its uses the final value of the function to form another value or responese or output


    }
}
