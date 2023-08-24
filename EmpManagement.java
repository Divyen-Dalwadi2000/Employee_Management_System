package employeeManagementSystem;

import employeeManagementSystem.DriverClass;
import employeeManagementSystem.EmployeeDetails;
import java.util.HashSet;
import java.util.Scanner;

public class EmpManagement {

  boolean foundDetails = false; // for the view Employee
  int ch; // for the Switch case

  int eid;
  String name;
  int age;
  String Designation;
  String Department;
  Double Salary;

  HashSet<EmployeeDetails> empSet = new HashSet<EmployeeDetails>();
  Scanner sc = new Scanner(System.in);

  EmployeeDetails e1 = new EmployeeDetails(
    1,
    "Divyen",
    22,
    "Java Developer",
    "IT",
    45000.00
  );
  EmployeeDetails e2 = new EmployeeDetails(
    2,
    "Pooja",
    23,
    "Python Developer",
    "IT",
    50000.00
  );
  EmployeeDetails e3 = new EmployeeDetails(
    3,
    "Harshit",
    22,
    "Admin",
    "DEvOps",
    100000.00
  );
  EmployeeDetails e4 = new EmployeeDetails(
    4,
    "Meet",
    21,
    "CO",
    "System Eng",
    500000.00
  );

  public EmpManagement() {
    empSet.add(e1);
    empSet.add(e2);
    empSet.add(e3);
    empSet.add(e4);
  }

  // 🍮 view all employee details
  public void viewAllEmpDetails() {
    for (EmployeeDetails emp : empSet) {
      System.out.println(emp);
    }
  }

  // 🍮 view Employee Detail Based on Id
  public void viewEmp() {
    System.out.println("Enter Employee Id : ");
    eid = sc.nextInt();
    for (EmployeeDetails emp : empSet) {
      if (emp.getId() == eid) {
        System.out.println(emp);
        foundDetails = true;
      }
    }
    if (!foundDetails) {
      System.out.println("Employee Id is Not Exists ");
    }
  }

  // 🍮 Update Employee Detail Based on Id
  public void updateEmp() {
    foundDetails = false;
    System.out.println("Enter Employee Id : ");
    eid = sc.nextInt();
    for (EmployeeDetails emp : empSet) {
      if (emp.getId() == eid) {
        do {
          System.out.println(
            "\n=============== 😎 Update The Employee Details 😎 ===============" +
            "\n1) Name update " +
            "\n2) Age update " +
            "\n3) Designation Update " +
            "\n4) Department Update " +
            "\n5) Salary Update " +
            "\n6) Back To Main Menu  " +
            "\n7) Exist   "
          );
          System.out.println("Enter Your Choice : ");
          ch = sc.nextInt();
          switch (ch) {
            case 1:
              System.out.print("Enter Name : ");
              name = sc.next();
              emp.setName(name);
              viewAllEmpDetails();
              break;
            case 2:
              System.out.print("Enter Age : ");
              age = sc.nextInt();
              emp.setAge(age);
              viewAllEmpDetails();
              break;
            case 3:
              System.out.print("Enter Designation : ");
              Designation = sc.next();
              emp.setDesignation(Designation);
              viewAllEmpDetails();
              break;
            case 4:
              System.out.println("Enter Department : ");
              Department = sc.next();
              emp.setDepartment(Department);
              viewAllEmpDetails();
              break;
            case 5:
              System.out.println("Enter Salary :");
              Salary = sc.nextDouble();
              emp.setSalary(Salary);
              viewAllEmpDetails();
              break;
            case 6:
              System.out.println("Back to Main Menu");
              DriverClass.menu();
              break;
            case 7:
              System.out.println("Done");
              System.exit(0);
              break;
            default:
              System.out.println("Invalid Choice");
              break;
          }
        } while (true);
        // foundDetails = true ;
      }
    }
    if (!foundDetails) {
      System.out.println("Employee Id is Not Exists ");
    } else {
      System.out.println("Employee Detail Updated SuccessFully");
    }
  }

  // 🍮 Delete Employee Detail Based on Id
  public void deleteEmp() {
    EmployeeDetails empdelete = null;
    foundDetails = false;
    System.out.println("Enter ID :");
    eid = sc.nextInt();
    for (EmployeeDetails emp : empSet) {
      if (emp.getId() == eid) {
        empdelete = emp;
        foundDetails = true;
      }
    }
    if (!foundDetails) {
      System.out.println("Id is Not Exists");
    } else {
      // 🌟 with the remove method Delete the employee details
      empSet.remove(empdelete);
      System.out.println("Successfully Delete 👺 ");
    }
  }

  // 🍮 Add Employee Detail
  public void addEmp() {
    System.out.print("Enter Employee ID : ");
    eid = sc.nextInt();
    System.out.print("Enter Employee Name : ");
    name = sc.next();
    System.out.print("Enter Employee Age : ");
    age = sc.nextInt();
    System.out.print("Enter Employee Designation : ");
    Designation = sc.next();
    System.out.print("Enter Employee Department : ");
    Department = sc.next();
    System.out.print("Enter Employee Salary : ");
    Salary = sc.nextDouble();

    EmployeeDetails emp = new EmployeeDetails(
      eid,
      name,
      age,
      Designation,
      Department,
      Salary
    );

    empSet.add(emp);
    System.out.println(emp);
    System.out.println("Add Employee details SuccessFully");
  }
}
