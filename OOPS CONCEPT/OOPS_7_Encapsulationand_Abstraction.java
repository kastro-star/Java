
class ApplForm {
    private String name;
    private int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setValues(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Optionally, getters
    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}

public class OOPS_7_Encapsulationand_Abstraction {
    public static void main(String[] args) {
        ApplForm kastro = new ApplForm();
        kastro.setValues(89564, "kastro");
        kastro.display();
    }
}


 //encapsulation is the process of hiding the data members of a class from the outside world.

//Achieves encapsulation by hiding fields with private and controlling access via methods.

//Encapsulation Goal: Protect the internal state of objects from direct access/modification.


//abstraction is the process of hiding the internal details of a class from the outside world.