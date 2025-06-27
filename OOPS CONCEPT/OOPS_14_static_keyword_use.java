public class OOPS_14_static_keyword_use {
    public static void main(String[] args) {
        System.out.println(fatherus.age);
        daughterus.age=18;
        System.out.println(fatherus.age);
        System.out.println(daughterus.age);
    }
}
class fatherus{
    char gender = 'm';

    static int age = 50;          //static keyword is used in the methods or variables is play a role as a global var or method change the value it made chages to all

    static void print(){
        System.out.println("father's class ");
    }
}

class daughterus extends fatherus{
    char gender = 'F';


}