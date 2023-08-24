package employeeManagementSystem;

public class EmployeeDetails {

  private int eid;
  private String name;
  private int age;
  private String Designation;
  private String Department;
  private Double Salary;

  public EmployeeDetails(
    int eid,
    String name,
    int age,
    String Designation,
    String Department,
    Double Salary
  ) {
    this.eid = eid;
    this.name = name;
    this.age = age;
    this.Designation = Designation;
    this.Department = Department;
    this.Salary = Salary;
  }

  public int getId() {
    return eid;
  }

  public void setId(int eid) {
    this.eid = eid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDesignation() {
    return Designation;
  }

  public void setDesignation(String designation) {
    Designation = designation;
  }

  public String getDepartment() {
    return Department;
  }

  public void setDepartment(String department) {
    Department = department;
  }

  public Double getSalary() {
    return Salary;
  }

  public void setSalary(Double salary) {
    Salary = salary;
  }

  @Override
  public String toString() {
    return (
      "EmployeeDetails [eid=" +
      eid +
      ", name=" +
      name +
      ", age=" +
      age +
      ", Designation=" +
      Designation +
      ", Department=" +
      Department +
      ", Salary=" +
      Salary +
      "]"
    );
  }
}
