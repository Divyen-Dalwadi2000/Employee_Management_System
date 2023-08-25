package employeeManagementSystem;

import employeeManagementSystem.EmpManagement;
import employeeManagementSystem.EmployeeDetails;
import java.util.Scanner;

public class DriverClass {

  // EmployeeService service = new EmployeeService;
  static boolean ordering = true;

  public static void menu() {
    Scanner sc = new Scanner(System.in);
    EmpManagement em = new EmpManagement();
    do {
      System.out.println(
        "\n=============== 🙏 Employee Management System 🙏 ===============" +
        "\n1) Add Employee " +
        "\n2) View Employee " +
        "\n3) Update Employee " +
        "\n4) Delete Employee " +
        "\n5) View all Employee Details " +
        "\n6) Exist   "
      );

      System.out.println("Enter your choice : ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Add Employee Details");
          em.addEmp();
          break;
        case 2:
          System.out.println("View Employee Details");
          em.viewEmp();
          break;
        case 3:
          System.out.println("Update Employee Details");
          em.updateEmp();
          break;
        case 4:
          System.out.println("Delete Employee Details");
          em.deleteEmp();
          break;
        case 5:
          System.out.println("View all Employee Details");
          em.viewAllEmpDetails();
          break;
        case 6:
          System.out.println(" 🙏 Thank you for using Application 🙏");
          System.exit(0);
          break;
        default:
          System.out.println("Please Enter Valid Choice");
          break;
      }
    } while (ordering);
  }

  public static void main(String[] args) {
    menu();
  }
}




