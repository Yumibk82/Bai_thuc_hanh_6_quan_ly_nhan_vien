package Views;

import Behaviors.EmployeeFactory;
import Behaviors.EmployeeManagement;
import Entities.Employee;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static Employee getEmployeeInfo(String position){
        Employee employee = EmployeeFactory.getEmployee(position);
        System.out.println("Enter employee's name");
            String employeeName = input.nextLine();
            employee.setName(employeeName);
        System.out.println("Enter employee's date of birth");
            String employeeDOB = input.nextLine();
            employee.setDOB(employeeDOB);
        System.out.println("Enter employee's gender");
            String employeeGender = input.nextLine();
            employee.setGender(employeeGender);
        System.out.println("Enter employee's address");
            String employeeAddress = input.nextLine();
            employee.setAdd(employeeAddress);
        return employee;
    }
    public static Employee searchEmployee(EmployeeManagement<Employee> em){
        System.out.println("Enter employee's employee number");
        Employee employee = em.search(Integer.parseInt(input.nextLine()));
            if(employee == null){
                System.out.println("No such employee");
                return null;
            }else{
                return employee;
            }
    }
}
