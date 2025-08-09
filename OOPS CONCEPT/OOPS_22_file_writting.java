import java.io.File;
import java.io.FileWriter;



public class OOPS_22_file_writting {
    public static void main(String[] args) {
        try {
            File reader = new File("C:\\JAVA\\java2\\java2\\src\\example.txt");  //creating an object for read the files
            FileWriter fr = new FileWriter(reader);
            fr.write("kastro the ai developer");
            fr.close();

            System.out.println(reader);

        }catch (Exception h ){
            System.out.println(h);
        }

    }
}
