package Question4;

public class TypeA extends Student {
    String Type="Full Fee";
    TypeA(String n)
    {
        super.name=n;
    }
    @Override
    void calculatefee() {
        System.out.println("-> Name :"+name );
        System.out.println("-> Type :"+Type );
        System.out.println("->Your fee is :" + ((numberOfCourses*perCourseFee)*50)/100);
    }

}
