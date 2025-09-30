# EmployeeManagementSystem
1. Problem Statement 
A small organization with fewer than 8 employees wants to manage their employee data (name, 
department, role, salary) using a simple Python program. 
The system should allow adding, viewing, searching, updating, and deleting employee details using 
only functions (no OOP, no database, no file storage). 
2. Features & Functionalities 
1. Add Employee 
o Input: ID, Name, Department, Role, Salary 
o Restrict maximum employees to 8 only 
2. View Employees 
o Display all employees in a tabular format 
3. Search Employee 
o Find employee by ID or Name 
4. Update Employee 
o Modify existing employee details 
5. Delete Employee 
o Remove employee record 
6. Exit Program 
o End the application safely 
3. Requirements 
• Python 3.8+ 
• Knowledge of: 
o Lists & dictionaries 
o Functions 
o Loops & conditionals 
4. Data Structure 
Employees will be stored in a list of dictionaries (maximum 8 records). 
Example: 
employees = [ 
{"id": 1, "name": "Alice", "department": "HR", "role": "Manager", "salary": 50000}, 
{"id": 2, "name": "Bob", "department": "IT", "role": "Developer", "salary": 60000} 
] 
5. Functions to Implement 
• add_employee(employees) – Add a new employee (check limit = 8). 
• view_employees(employees) – Show all employees. 
• search_employee(employees) – Find employee by ID or name. 
• update_employee(employees) – Edit employee details. 
• delete_employee(employees) – Delete employee by ID. 
• menu() – Display menu and call functions. 
6. Menu Example 
===== Employee Management System ===== 
1. Add Employee 
2. View Employees 
3. Search Employee 
4. Update Employee 
5. Delete Employee 
6. Exit 
Enter your choice:  
7. Step-by-Step Implementation Guide 
