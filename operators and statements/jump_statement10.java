public class jump_statement10
{
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            if (i==5){
                continue;   //break statement--it terminates the loop and exit
                            //continue --suspend the current loop and continue them
            }

            System.out.println(i);
        }
        System.out.println("program ended");
    }
}
