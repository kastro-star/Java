public class while_loop_and_do_while_loop {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 1;

        //while loop  ENTRY CONTROLL LOOP
        while (i<n){
            sum +=i;
            i++;
        }
        System.out.println(sum);

        //do while loop EXIT CONTROLL LOOP
        do{
            sum = sum+i;
            i++;

        }while (i<n);
        System.out.println(sum);

        
    }
}
