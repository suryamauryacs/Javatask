package karat.assigment;
//Employee{empId,eName,Salary,deptId} , you have list of employees
//   Write a java program to find the employee names of top three salaries.
//   Write a java program to find the employee name who is having the 3rd highest salary.

public class Employee {

    int empId;
    String eName;
    double salary;
    int deptId;

    public Employee(int empId, String eName, double salary, int deptId) {
        this.empId = empId;
        this.eName = eName;
        this.salary = salary;
        this.deptId = deptId;
    }

    public String getEName() { return eName; }
    public double getSalary() { return salary; }


}
