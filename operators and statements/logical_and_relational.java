public class logical_and_relational {
    public static void main(String[] args) {
        //logical operators
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b); //check and b values are same
        System.out.println(a!=b); //check and b values are not same


        //Relational operatos
        boolean c = true;
        boolean d = false;


        System.out.println(!c);
        System.out.println(!d);

        //or operator  (any one is true is true )
        System.out.println(c||d);
        //and operator (both are true is true)
        System.out.println(c&&d);



        //precedence of operators
        //1. ()
        //2. ^
        //3. * / %
        //4. + -
        //5. == != > < >= <=
        //6. &&
        //7. ||
        //eg:
        int e = 10*b+a;
        System.out.println(e);


    }
}
