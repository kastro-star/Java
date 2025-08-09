import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kastro's personal calculator");
        while (true){
//            System.out.println("Kastro's personal calculator");
            System.out.print("enter your operator");
            char op = input.next().trim().charAt(0);
            System.out.print("enter your first number:");
            int num1 =input.nextInt();
            System.out.print("enter your second number:");
            int num2 = input.nextInt();
            int ans = 0;
            if(op=='+'|| op =='-' || op == '*' || op == '/'|| op =='%' ){
                if(op =='+'){
                    ans = num1+num2;
                }
                if(op =='-'){
                    ans = num1-num2;
                }
                if(op =='*'){
                    ans = num1*num2;
                }
                if(op =='/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                }


            }
            System.out.println("your output is: "+ans);
        }
    }
}
