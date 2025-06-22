

//single inheritance --is an inheritance contains one parent and child classes
//multi level inheritance --is an inheritance contains more than two classes that extends(one parents more child )
//Hierarchical inheritance--one parent class and more child class are here
//hybrid inheritance -- two combine any singlr or multi or hieraechical is hybrid
//multiple inheritance(is not directly supported in java) --

//class father  {
//    char gender = 'M';
//    void print(){
//        System.out.println("single inheritance");
//    }
//                                    IT IS A SINGLE INHERITANCE
//}
//
//class son extends father{
//
//}
//public class OOPS_11_typesofinheritance_ {
//    public static void main(String[] args) {
//        son kes = new son();
//        System.out.println(kes.gender);
//        kes.print();
//
//    }
//}










//class grandfather{
//    char gender = 'M';
//    void print(){
//        System.out.println("multi  inheritance");
//    }
//                                   // IT IS A MULTI level  INHERITANCE
//}
//
//
//
//class mother extends grandfather  {
//    char gender = 'f';
//
//}
//
//
//class daughter extends mother{
//
//}
//public class OOPS_11_typesofinheritance_ {
//    public static void main(String[] args) {
//        daughter kes = new daughter();
//        System.out.println(kes.gender);
//        kes.print();
//
//    }
//}


import org.w3c.dom.ls.LSOutput;
class father{
    char gender = 'M';
    void print(){
        System.out.println("hierarchical inheritance");
    }
    // IT IS A MULTI level  INHERITANCE
}



class daughter extends father  {

    char gender = 'f';

}


class son extends father{
                                          //its a hierarchical inheritance
}
public class OOPS_11_typesofinheritance_ {
    public static void main(String[] args) {
        daughter kes = new daughter();
        System.out.println("daughter");
        System.out.println(kes.gender);
        kes.print();
        System.out.println("son");



        son us = new son();
        us.print();
        System.out.println(us.gender);


        granddaughter usa = new granddaughter();
        usa.print();
        System.out.println(us.gender);

    }
}

//its an hybrid inheritance

class granddaughter  extends daughter{


}
class grandgranddaughter extends granddaughter {
    char i = 'a';

    void therla(){
        System.out.println("hii garnnd grand daughter");
    }



}

