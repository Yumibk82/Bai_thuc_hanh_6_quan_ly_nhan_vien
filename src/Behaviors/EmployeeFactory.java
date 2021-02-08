package Behaviors;

import Entities.Employee;
import Entities.Engineer;
import Entities.Staff;
import Entities.Worker;

import java.util.Scanner;

public class EmployeeFactory {
    public static Employee getEmployee(String position) {

        Scanner input = new Scanner(System.in);

        switch (position) {
            case "Worker":
                Worker worker = new Worker();
                System.out.println("Enter worker's rank");
                String rankWork = input.nextLine();
                worker.setRank(rankWork);
                System.out.println("Enter worker's basic salary");
                double basicSalaryWorker = input.nextDouble();
                worker.setBasicSalary(basicSalaryWorker);
                return worker;
            case "Engineer":
                Engineer engineer = new Engineer();
                System.out.println("Enter engineer's major");
                String majorEngineer = input.nextLine();
                engineer.setMajor(majorEngineer);
                System.out.println("Enter engineer's basic salary");
                double basicSalaryEngineer = input.nextDouble();
                engineer.setBasicSalary(basicSalaryEngineer);
                return engineer;
            case "Staff":
                Staff staff = new Staff();
                System.out.println("Enter staff' job");
                String jobStaff = input.nextLine();
                staff.setJob(jobStaff);
                System.out.println("Enter staff's basic salary");
                double basicSalaryStaff = input.nextDouble();
                staff.setBasicSalary(basicSalaryStaff);
            default:
                return null;
        }
    }
}
