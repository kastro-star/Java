class sample{

    int rollno;
    String name ;

    //difference between constructors and methods are that constructors are used to initialize the object and methods are used to perform the operation on the object
    sample(){
        System.out.println("constructor called first time");
        rollno = 101;
        name = "kastro";
    }
    //methods are called multiple times but constructors are called only once at the time of object creation
}

public class OOPS_6_constructors {
    public static void main(String[] args) {
        sample kastrl = new sample();   // constructors are called only once at the time of object creation
        System.out.println(kastrl.rollno);
        System.out.println(kastrl.name);

    }
}


