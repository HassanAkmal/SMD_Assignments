package Question1;

public class Intern extends Employee{

    public void addbenefits()
    {
        //We are here basically Hard Code some Benefits
        //BUt actually You can add by manually using inputs
        benefits.add("Basic Benfits");
    }
    @Override
    void showbenefits()
    {
        addbenefits();
        System.out.println("Intern Benefits are :");
        for(String str:benefits)
        {
            System.out.println("->"+str);
        }
    }
    @Override
    public String calculatepay()
    {
        return ("Intern Amount is:20000");
    }
}
