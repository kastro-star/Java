//public class OOPS_15_final_super_and_thiskeyword {
//    public static void main(String[] args) {
//        soner k = new soner();
//        System.out.println(k.gener);
//
//        k.print();
//
//    }
//}
//
//class fath {
//    final char gener ='M';// it
//    //char gener ='k';
//
//    void print(){
//        System.out.println("final keyword declared it cannot be overritted");
//    }
//}
//
//class soner extends fath {
//    char gener = 'f';
//
//     void print() {
//       // final keyword is used it cannot be overritted
//        System.out.println("fchcvhtrcvtru");
//        super.print();        //super keyword it takes the variable or method from the parent class only is called super keyword
//    }
//}



public class OOPS_15_final_super_and_thiskeyword {
    public static void main(String[] args) {
        kastro ne =new kastro();
        ne.print("kastrx",67);
        System.out.println(ne.age);
        System.out.println(ne.gender);

    }
}

class kastro{
    String gender;
    int age ;

    void print(String gender, int age ){
        this.gender = gender;
        this.age = age;
        System.out.println("this keyword is used for pass the values to the variables and this--speciy this to the compilier to tell about the value ");


    }
}


