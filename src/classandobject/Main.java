package classandobject;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="vicky";
        System.out.println("Before assigning the value of student :- "+student);

        student.id=123;
        student.name="Vicky Gupta";
        student.branch="Computer Science";
        student.course="MCA";
        student.dob="03/05/2003";
        student.email="mrvg4545@gmail.com";


        System.out.println("After assigning the value of student :- "+student);

    }
}
