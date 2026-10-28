public class LogicalOps {
    public static void main(String[] args) {
        int salaryExpected = 50000;
        int salaryOffered = 25000;
        boolean isNightShift = true;

        System.out.println("Salary offered is greater than expected and it's a night shift: " + (salaryOffered > salaryExpected && isNightShift));

        if (false || true) {
            System.out.println("I will accpet the job offer");
        } else {
            System.out.println("I will VIP");
        }

        System.out.println("Whats not ? " + isNightShift);
        System.out.println("Whats not ? " + !isNightShift);
    }
}
