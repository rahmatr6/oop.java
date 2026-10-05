import java.util.Scanner;

class Employee {

    // Private data members
    private int employeeId;
    private String name;

    // Setter for Employee ID
    public void setEmployeeId(int id) {
        employeeId = id;
    }

    // Getter for Employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for Name
    public void setName(String n) {
        name = n;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Method to show employee details
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

        // Using setter methods
        emp.setEmployeeId(id);
        emp.setName(name);

        // Displaying employee details
        emp.showDesignation(designation);

        scanner.close();
    }
}