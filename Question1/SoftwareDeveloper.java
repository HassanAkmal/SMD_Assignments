package Question1;

public class SoftwareDeveloper extends Employee {
    public void addbenefits()
    {
        //We are here basically Hard Code some Benefits
        //BUt actually You can add by manually using inputs
        benefits.add("Basic Benfits");
        benefits.add("Dev Benefits");
    }
    @Override
    void showbenefits()
    {
        addbenefits();
        System.out.println("Software Developer Benefits are :");
        for(String str:benefits)
        {
            System.out.println("->"+str);
        }
    }
    @Override
    public String calculatepay()
    {
        return "Software Developer Amount :45000";
    }
}
