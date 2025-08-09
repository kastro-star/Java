import java.io.File;
import java.util.Scanner;


public class OOPS_21_file_reading {
    public static void main(String[] args) {
        try {
            File reader = new File("C:\\JAVA\\java2\\java2\\src\\example.txt");  //creating an object for read the files
            Scanner readert = new Scanner(reader);      // create an scanner object for give input to the program
            while (readert.hasNextLine()) {             //while loop used --hasnextline read the line and inside of the loop print them repeatedly executed fully prints the file
                System.out.println(readert.nextLine());
            }
        }catch (Exception h ){
            System.out.println(h);
        }

    }
}
