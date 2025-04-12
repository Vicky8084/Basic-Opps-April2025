package classandobject;

public class Student {
    public int id;
    public String name;
    public String course;
    public String email;
    public String branch;
    public String dob;

    @Override
    public String toString() {
        return "Student :- " +
                "id :- " + id +
                ", name :- '" + name + '\'' +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                ", branch='" + branch +'\''+
                ", dob='" + dob + '\'';
    }
}
