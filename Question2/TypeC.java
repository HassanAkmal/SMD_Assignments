package Question4;

public class TypeC extends Student {
        String Type="Fund";
        TypeC(String n)
        {
            super.name=n;
        }
        @Override
        void calculatefee() {
            System.out.println("-> Name :"+name );
            System.out.println("-> Type :"+Type );
            System.out.println("->Your fee is :" + ((numberOfCourses*perCourseFee)*25)/100);
        }
}
