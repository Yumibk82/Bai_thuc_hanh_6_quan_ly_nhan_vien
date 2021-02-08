package Entities;

public class Employee {
    private int employeeNo;
    private String name;
    private String DOB;
    private String gender;
    private String add;

    private double basicSalary;
    private int rate;//ratio=realWorkingDay/bonus/penalty

    public Employee(){

    }

    public Employee(int employeeNo,String name, String DOB, String gender, String add,double basicSalary,int rate) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
        this.add = add;
        this.basicSalary = basicSalary;
        this.rate = rate;
    }

    public int getEmployeeNo(){
        return employeeNo;
    }
    public void setEmployeeNo(int employeeNo){
        this.employeeNo = employeeNo;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public double getBasicSalary(){
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }
    public double getSalary(double basicSalary,int rate){
        return this.basicSalary*this.rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee number "+employeeNo+
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", gender='" + gender + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
