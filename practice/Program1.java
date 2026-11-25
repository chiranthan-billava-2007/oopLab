// ## Problem Statement: Employee Management System

//  Develop a **Java program** to create a class `Employee` with the following data members:

//  - Employee ID
// - Employee Name
// - Department
// - Salary

//  The program should include methods to **accept and display employee details**.

//  Create multiple `Employee` objects using an array and perform the following operations:

//  1. Accept details for multiple employees.
// 2. Ensure that each **Employee ID is unique** using a `HashSet`.
// 3. Validate the employee name so that it contains only alphabets and spaces.
// 4. Validate the salary so that it is greater than `0`.
// 5. Display the details of all employees.
// 6. Find and display the employee with the **highest salary**.
// 7. Calculate and display the **average salary** of all employees.
// 8. Allow the user to search for an employee using their Employee ID.

//  ### Sample Input

// ```
// Enter number of employees: 3

// Enter details for Employee 1:
// Employee ID: E101
// Name: Rahul Kumar
// Department: IT
// Salary: 45000

// Enter details for Employee 2:
// Employee ID: E102
// Name: Priya Sharma
// Department: HR
// Salary: 50000

// Enter details for Employee 3:
// Employee ID: E103
// Name: Arjun
// Department: Finance
// Salary: 40000
// ```

//  ### Expected Output

// ```
// ===== Employee Details =====

// Employee 1:
// ID         : E101
// Name       : Rahul Kumar
// Department : IT
// Salary     : 45000.0

// Employee 2:
// ID         : E102
// Name       : Priya Sharma
// Department : HR
// Salary     : 50000.0

// Employee 3:
// ID         : E103
// Name       : Arjun
// Department : Finance
// Salary     : 40000.0

// ===== Highest Salary =====
// Name   : Priya Sharma
// Salary : 50000.0

// ===== Average Salary =====
// 45000.0

// Enter Employee ID to search: E102

// Employee Found:
// Name       : Priya Sharma
// Department : HR
// Salary     : 50000.0
// ```

//  ### Concepts to practice

//  This problem will make you practice:

//  `Class → Objects → Array of Objects → Methods → Scanner → Validation → HashSet → Searching → Calculations`

//  **Try writing it yourself first.** If you get stuck, send me your code and I'll help you debug it step by step.

import java.util.Scanner;
import java.util.HashSet;



class Employee{
    String employeeId;
    String employeeName;
    String department;
    double salary;

    void acceptDetails(Scanner sc, HashSet<String> usns){
        
    }


}


public class Program1{
    public static void main(String[] args) {
        
    }

}