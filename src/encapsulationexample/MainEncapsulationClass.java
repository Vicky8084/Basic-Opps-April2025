package encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("Vicky Gupta");
        teacher.setDOB("03/05/2003");
        teacher.setAddress("Madhopur");
        teacher.setDept("MCA");
        teacher.setEmail("mrvg4545675@gmail.com");

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("The Details of Teacher is :- "+teacher);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Teacher name is :- "+teacher.getName());
        System.out.println("Teacher's DOB is :- "+teacher.getDOB());
        System.out.println("Teacher Address is :- "+teacher.getAddress());
        System.out.println("Teacher's Department is :- "+teacher.getDept());
        System.out.println("Teacher Email is :- "+teacher.getEmail());
    }
}
