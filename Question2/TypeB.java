package Question4;

public class TypeB extends Student {
    String Type="Scholarship";
    TypeB(String n)
    {
        super.name=n;
    }
    @Override
    void calculatefee() {
        System.out.println("-> Name :"+name );
        System.out.println("-> Type :"+Type );
        System.out.println("->Your fee is :" + ((numberOfCourses*perCourseFee)));

    }
}
