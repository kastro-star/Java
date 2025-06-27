import java.util.Scanner;

public class OOPS_16_scanner {
    public static void main(String[] args) {
        Scanner kas = new Scanner(System.in);
        System.out.println("enter the values");
        int kasa = kas.nextInt();
        System.out.println(kasa);
        kas.nextLine();

        char j = kas.nextLine().charAt(4);
        System.out.println(j);
        String kah = kas.nextLine();
        System.out.println(kah);



    }
}
