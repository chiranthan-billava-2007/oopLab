// Develop a Java program to create a class Student with members USN and
// Name. Include methods to accept and display student details. Create
// multiple student objects and display their information.

import java.util.Scanner;
import java.util.HashSet;

class Student {

    private String usn;
    private String name;

    public void acceptDetails(Scanner sc, HashSet<String> usns) {

        // Validate USN
        while (true) {
            System.out.print("Enter USN (exactly 10 characters): ");
            usn = sc.nextLine();

            if (usn.length() == 10) {

                // Check whether USN is unique
                if (usns.add(usn)) {
                    break;
                } else {
                    System.out.println(
                        "USN already exists! Please enter a different USN."
                    );
                }

            } else {
                System.out.println(
                    "Invalid! USN must be 10 characters long. Try again."
                );
            }
        }

        // Validate Name
        while (true) {
            System.out.print("Enter Name: ");
            name = sc.nextLine();

            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println(
                    "Invalid! Name must contain only alphabets. Try again."
                );
            }
        }
    }

    public void displayDetails() {
        System.out.println("USN : " + usn);
        System.out.println("Name : " + name);
        System.out.println("--------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];

        // HashSet to store unique USNs
        HashSet<String> usns = new HashSet<>();

        // Accept student details
        for (int i = 0; i < n; i++) {

            students[i] = new Student();

            System.out.println(
                "\nEnter details for Student " + (i + 1) + ":"
            );

            students[i].acceptDetails(sc, usns);
        }

        // Display student details
        System.out.println("\n===== Student Details =====");

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1) + ":");

            students[i].displayDetails();
        }

        sc.close();
    }
}