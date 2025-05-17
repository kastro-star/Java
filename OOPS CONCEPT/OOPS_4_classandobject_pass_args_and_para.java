class applform {             //class is created
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public  void setvalues(int ner, String roll){ // parameters are passed to the function using the object
        rollno = ner;
        name = roll;

    }
 }

public class OOPS_4_classandobject_pass_args_and_para {
    public static void main(String[] args) {
        applform kastro = new applform();      //object is created
        kastro.setvalues(89, "kastro");      //aruments are passed to the function using the object
        kastro.display();

    }
}
