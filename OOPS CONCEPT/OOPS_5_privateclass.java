class applkform {             //class is created
    private String name;         //'private' is used to make the variable private to the class
    //can be accessed only inside the class  not outside of the class
    int rollno;
    protected String address;     //protected can access inside the file and the class but not outside of the class and the files in the project
    public void display() {
        System.out.println(name);   //name is  accessed by the display function using public ..this access the variable of the class and passes the value to outside of the class
        System.out.println(rollno);
    }

    public  void setvalues(int ner, String roll){ // parameters are passed to the function using the object
        rollno = ner;
        name = roll;

    }

    public void getvalues(){
        System.out.println(name);
        System.out.println(rollno);
    }

}

public class OOPS_5_privateclass {
    public static void main(String[] args) {
        applkform objectname = new applkform();
        objectname.rollno = 101;
        objectname.setvalues(89, "kastro");  //name is  accessed by the setvalues function using the object
        objectname.display();
        objectname.getvalues();//name is also accessed by getvalues function

    }
}

// Access Modifiers:
// public    - Accessible from anywhere
// protected - Accessible within the same package and subclasses (not using in various files)
// private   - Accessible only within the same class



