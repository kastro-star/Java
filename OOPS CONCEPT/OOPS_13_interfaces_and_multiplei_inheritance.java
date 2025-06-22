interface fathera{
    abstract void call();

    abstract void talk();

}
interface mother{
    abstract void call();
    abstract void talk();
}
class sono implements fathera,mother{
    public void call(){
        System.out.println("calling");
    }

    public void talk(){
        System.out.println("mother talk");

    }
    public static void main(String[] args) {
        sono in = new  sono();
        in.call();
        in.talk();

    }
}