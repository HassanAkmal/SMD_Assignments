package Question1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Employee> l=new ArrayList<Employee>();
        l.add(new Intern());
        l.add(new ProjectManager());
        l.add(new SoftwareDeveloper());
        System.out.println("\n\t\tEmployee Information System");
        for(Employee str:l)
        {
            str.showbenefits();
            System.out.println(str.calculatepay()+"\n");
        }
    }
}
