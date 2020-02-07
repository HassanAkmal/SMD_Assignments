package Question4;

public class Main {
    public static void main(String [] args)
    {
        Student objA=new TypeA("Hassan");
        Student objB=new TypeB("Akmal");
        Student objC=new TypeB("Badar");

        System.out.println("\n\t\tStudent Account Information");
        objB.calculatefee();
        objA.calculatefee();
        objC.calculatefee();


    }
}
