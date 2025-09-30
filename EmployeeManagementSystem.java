import java.util.ArrayList;
import java.util.Scanner;
import model.Employee;
import service.EmployeeService;

public class EmployeeManagementSystem {

    private static final ArrayList<Employee> employees = new ArrayList<>();
    private static final int MAX_EMPLOYEES = 8;


    private static final Scanner sc = new Scanner(System.in);

    /**
     * Displays the main menu and handles user input for employee management operations.
     * The menu allows adding, viewing, searching, updating, and deleting employees.
     * Loops until the user chooses to exit.
     */
    private static void menu() {
        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    EmployeeService.addEmployee();
                    break;
                case 2:
                    EmployeeService.viewEmployees();
                    break;
                case 3:
                    EmployeeService.searchEmployee();
                    break;
                case 4:
                    EmployeeService.updateEmployee();
                    break;
                case 5:
                    System.out.println("👉 Delete Employee (to be implemented)");
                    break;
                case 6:
                    EmployeeService.deleteEmployee();
                    return;
                default:
                    System.out.println("❌ Invalid choice, try again.");
            }
        }
    }

    /**
     * The entry point of the Employee Management System application.
     * Invokes the menu to start user interaction.
     */
    public static void main(String[] args) {
        menu();
    }
}
