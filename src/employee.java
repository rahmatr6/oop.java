import java.util.Scanner;

class Employee {

    
    private int employeeId;
    private String name;

    public void setEmployeeId(int id) {
        employeeId = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void showDesignation(String designation) {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Designation: " + designation);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Designation: ");
        String designation = scanner.nextLine();

        emp.setEmployeeId(id);
        emp.setName(name);

        emp.showDesignation(designation);

        scanner.close();
    }
}
