package Methods;

public class Employee {
    String name;
    int salary;

    static void EmployeeDetails() {
        String name = "Reetabrata Bhandari";
        int salary = 35000;
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void Display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
    static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Reetabrata";
        emp.salary = 50000;
        emp.Display();
        EmployeeDetails();
        emp.Display();
    }
}