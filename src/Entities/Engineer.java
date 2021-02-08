package Entities;

public class Engineer extends Employee{
    private String major;

    public Engineer(){

    }
    public Engineer(String major) {
        this.major = major;
    }

    public Engineer(int employeeNo,String name, String DOB, String gender, String add, String major,double basicSalary,int rate) {
        super(employeeNo,name, DOB, gender, add,basicSalary,rate);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "major='" + major + '\'' +
                '}';
    }
}
