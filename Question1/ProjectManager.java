package Question1;

import java.util.ArrayList;

public class ProjectManager extends Employee {
    public void addbenefits()
    {
        //We are here basically Hard Code some Benefits
        //BUt actually You can add by manually using inputs
        benefits.add("Basic Benfits");
        benefits.add("Dev Benefits");
        benefits.add("Manager Benefits");
    }
    @Override
    void showbenefits()
    {
        addbenefits();
        System.out.println("Project Manager Benefits are :");
        for(String str:benefits)
        {
            System.out.println("->"+str);
        }
    }
    @Override
   public String calculatepay()
    {
        return "ProjectManager Amount :60000";
    }
}
