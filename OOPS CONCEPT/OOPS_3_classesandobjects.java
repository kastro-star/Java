class appform {
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        appform kastro =new appform();
        kastro.name = "kastro";
        kastro.rollno = 101;
        kastro.display();
    }
}

