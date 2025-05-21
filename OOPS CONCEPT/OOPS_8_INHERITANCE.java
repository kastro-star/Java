class animal{
    int no_legs=4;

    public static void eat(){
        System.out.println("animal eats");
    }

    public static void walk(){
        System.out.println("animal walks");
    }
}

class dog extends animal {         //use the extends keyword to inherit the class
    boolean barks=true;
}



public strictfp class OOPS_8_INHERITANCE {
    public static void main(String[] args) {
        dog tree =new dog();
        tree.barks=true;
        tree.no_legs=4;
        tree.eat();
        tree.walk();
        System.out.println(tree.barks);
        System.out.println(tree.no_legs);


    }

}