package General;

public class TernaryOps {
    public static void main(String[] args) {
        int marks = 72;

        // Traditional if-else: verbose (5 lines)
        String standardResult;

        if (marks >= 50) {
            standardResult = "PASS";
        } else {
            standardResult = "FAIL";
        }

        // condition ? x : y
        // Clean Ternary Operator (1 line)
        String ternaryResult = (marks >= 35) ? "PASS" : "FAIL";
        System.out.println("Result: " + ternaryResult);

        // Nested Ternary: Grading Scale
        // Caution: Keep readable; avoid deep nesting in production
        int score = 85;
        String grade = (score >= 90) ? "A"
                : (score >= 75) ? "B"
                : (score >= 50) ? "C" : "F";
        System.out.println("Student Grade: " + grade);

        // Inline string injection
        int cartItems = 1;
        System.out.println("You have " + cartItems + " item" + (cartItems == 1 ? "" : "s") + " in your cart.");
    }
}
