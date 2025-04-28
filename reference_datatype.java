import java.util.Date;
import java.awt.Point;


public class reference_datatype {
    public static void main(String[] args) {
        //primitive datatype independent (cannot change the values dont depend on others )
        System.out.println("Hello World");
        Date timeshow = new Date();      // date and new are keywords
        System.out.println(timeshow);
        Date today = new Date();
        System.out.println(today);

        //reference datatype   depends upon each other (one change of the values leads to alll chnage)
        Point P1 = new Point(10,20);
        Point P2 = P1;
        System.out.println(P2);

        P1.x =7;
        System.out.println(P1);
        System.out.println(P2);

    }
}
