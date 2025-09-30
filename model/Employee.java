package model;

/**
 * Represents an employee with basic details such as ID, name, department, role, and salary.
 * Provides methods to access and modify employee information.
 */
public class Employee {
    private int id;
    private String name;
    private String department;
    private String role;
    private double salary;

    /**
     * Constructs an Employee with the specified details.
     *
     * @param id         Unique identifier for the employee.
     * @param name       Name of the employee.
     * @param department Department where the employee works.
     * @param role       Role or position of the employee.
     * @param salary     Salary of the employee.
     */
    public Employee(int id, String name, String department, String role, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
    }


    /**
     * Returns the employee's unique ID.
     * @return Employee ID.
     */
    public int getId() { return id; }
    /**
     * Returns the employee's name.
     * @return Employee name.
     */
    public String getName() { return name; }
    /**
     * Returns the department of the employee.
     * @return Employee department.
     */
    public String getDepartment() { return department; }

    /**
     * Returns the role of the employee.
     * @return Employee role.
     */
    public String getRole() { return role; }

    /**
     * Returns the salary of the employee.
     * @return Employee salary.
     */

    public double getSalary() { return salary; }

    /**
     * Sets the department for the employee.
     * @param department New department name.
     */
    public void setDepartment(String department) { this.department = department; }

    /**
     * Sets the role for the employee.
     * @param role New role name.
     */
    public void setRole(String role) { this.role = role; }
    /**
     * Sets the salary for the employee.
     *
     * @param salary New salary value.
     */
    public void setSalary(double salary) { this.salary = salary; }

    /**
     * Returns a string representation of the employee with all details.
     * @return Formatted employee information.
     */


    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Dept: %s | Role: %s | Salary: %.2f",
                id, name, department, role, salary);
    }
}
