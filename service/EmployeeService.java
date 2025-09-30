package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Employee;

public class EmployeeService {
    static ArrayList<Employee> employees = new  ArrayList<Employee>();
    static int MAX_EMPLOYEES = 8;
    static Scanner sc = new Scanner(System.in);
    /**
     * Adds a new employee to the system after validating the maximum limit and unique ID.
     * Prompts the user for employee details via console input.
     * Displays a success or error message based on the operation result.
     */
    public static void addEmployee() {
        if (employees.size() >= MAX_EMPLOYEES) {
            System.out.println("❌ Maximum of " + MAX_EMPLOYEES + " employees reached.");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();


        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("❌ Employee with this ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Role: ");
        String role = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline

        Employee newEmp = new Employee(id, name, department, role, salary);
        employees.add(newEmp);

        System.out.println("✅ Employee added successfully!");
    }
    /**
     * Displays the list of all employees in the system.
     * If no employees exist, shows an appropriate message.
     */
    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("📂 No employees found.");
            return;
        }

        System.out.println("\n===== Employee List =====");
        for (Employee e : employees) {
            System.out.println(e);  // calls Employee.toString()
        }
        System.out.println("=========================\n");
    }
    /**
     * Searches for an employee by ID or name based on user input.
     * Displays the found employee or an error message if not found.
     */
  public static void searchEmployee() {
        System.out.println("Search by: 1) ID  2) Name");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            for (Employee e : employees) {
                if (e.getId() == id) {
                    System.out.println("✅ Found: " + e);
                    return;
                }
            }
            System.out.println("❌ Employee not found.");
        } else if (ch == 2) {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine().toLowerCase();
            boolean found = false;
            for (Employee e : employees) {
                if (e.getName().toLowerCase().contains(name)) {
                    System.out.println("✅ Found: " + e);
                    found = true;
                }
            }
            if (!found) System.out.println("❌ No employee with that name.");
        } else {
            System.out.println("❌ Invalid choice.");
        }
    }

    /**
     * Updates the department, role, or salary of an existing employee.
     * Prompts the user for the employee ID and the field to update.
     * Shows a success or error message based on the operation result.
     */
    public static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("Updating: " + e);
                System.out.println("1. Update Department");
                System.out.println("2. Update Role");
                System.out.println("3. Update Salary");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new Department: ");
                        String dept = sc.nextLine();
                        e.setDepartment(dept);
                        System.out.println("✅ Department updated!");
                        break;
                    case 2:
                        System.out.print("Enter new Role: ");
                        String role = sc.nextLine();
                        e.setRole(role);
                        System.out.println("✅ Role updated!");
                        break;
                    case 3:
                        System.out.print("Enter new Salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine();
                        e.setSalary(salary);
                        System.out.println("✅ Salary updated!");
                        break;
                    default:
                        System.out.println("❌ Invalid choice.");
                }
                return;
            }
        }
        System.out.println("❌ Employee ID not found.");
    }

    /**
     * Deletes an employee from the system by their ID.
     * Prompts the user for the employee ID and removes the employee if found.
     * Displays a success or error message.
     */
    public static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) {
            if (e.getId() == id) {
                employees.remove(e);
                System.out.println("🗑️ Employee deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Employee ID not found.");
    }





}
