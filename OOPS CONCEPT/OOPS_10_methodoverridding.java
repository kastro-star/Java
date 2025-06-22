class animals{
    int no_legs=4;

    public static void eat(){
        System.out.println("animal eats");
    }

    public static void walk(){
        System.out.println("animal walks");
    }
}

class dogs extends animals {         //use the extends keyword to inherit the class
    boolean barks=true;
    int no_legs=7;


    public static void eat(){
        System.out.println("hiii");
    }
}

public class OOPS_10_methodoverridding {
    public static void main(String[] args) {
        dogs tell = new dogs();
        System.out.println(tell.no_legs);
        tell.eat();

    }

}
