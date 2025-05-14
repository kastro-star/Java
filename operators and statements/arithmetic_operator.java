import java.sql.SQLOutput;

public class arithmetic_operator
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        float h = (float)a % (float)b;   //this type is change the values to float and then calculate the remainder
        //Type casting in programming is the process of converting a value from one data type to another

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


//        increment and decreament operators
//        Increment operator (++):
//        Increases the operand's value by 1. It has two forms:
//        Prefix (++variable): Increments the value and then returns the updated value.
//                Postfix (variable++): Returns the original value and then increments it.
//        Decrement operator (--):
//        Decreases the operand's value by 1, also with prefix and postfix forms similar to the increment operator.

          int k = 5;
        System.out.println(k++);
        System.out.println(++k);

    }
}
