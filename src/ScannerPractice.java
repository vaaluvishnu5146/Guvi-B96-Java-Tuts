import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student ID Card Generator ===");

        // 1. Read primitive integer
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        // 2. Read primitive double
        System.out.print("Enter Current GPA (e.g. 8.75): ");
        double gpa = scanner.nextDouble();

        // Without this line, scanner.nextLine() below eats the leftover '\n'
        // scanner.nextLine();

        // 3. Read complete string with spaces
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Major/Branch: ");
        String major = scanner.nextLine();

        System.out.println("\n--- Verified ID Card ---");
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Name    : " + fullName);
        System.out.println("Major   : " + major);
        System.out.println("GPA     : " + gpa);

        scanner.close();
    }
}
