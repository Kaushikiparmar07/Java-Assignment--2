import java.io.*;
import java.util.*;

abstract class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;
    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }
    abstract double calculateSalary();
    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
class PermanentEmployee extends Employee {
    PermanentEmployee(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }
    double calculateSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.40 * basicSalary;
        double pf = 0.12 * basicSalary;
        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;
        return netSalary;
    }
}
class ContractEmployee extends Employee {
    ContractEmployee(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    double calculateSalary() {
        double allowance = 0.10 * basicSalary;
        double grossSalary = basicSalary + allowance;
        return grossSalary;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Employee e;
        System.out.println("----- Permanent Employee -----");
        e = new PermanentEmployee(101, "Rahul", 50000);
        e.display();
        System.out.println("Net Salary: " + e.calculateSalary());
        System.out.println();
        System.out.println("----- Contract Employee -----");
        e = new ContractEmployee(102, "Amit", 30000);
        e.display();
        System.out.println("Gross Salary: " + e.calculateSalary());
    }
}