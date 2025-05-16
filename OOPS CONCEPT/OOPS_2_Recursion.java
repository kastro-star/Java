import javax.xml.namespace.QName;

public class OOPS_2_Recursion {
    public static void main(String[] args) {
        recursion(10);

    }
    //Recursive function that can call itself inside of the function
    public static void recursion(int n){
        //Base case
        if (n==1){
            System.out.println(1);
        }
        //Recursive case
        else{
            System.out.println(n);
            recursion(n-1);    //recursive call---Calls the function again and again

        }
    }
}
