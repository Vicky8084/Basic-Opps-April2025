package encapsulationexample;

public class Teacher {
    private String name;
    private String DOB;
    private String email;
    private String address;
    private String dept;

    //Converting Object into String

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }


    // Creating Getter Setter

    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

}

