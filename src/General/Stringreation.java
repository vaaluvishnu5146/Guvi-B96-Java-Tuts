public class Stringreation {
    public static void main(String[] args) {
        String movieOne = "Jailer1";
        String movieTwo = "Jailer1";

        // ==
        // It will check the reference equality
        if(movieOne == movieTwo) {
            System.out.println("Both strings are the same");
        } else {
            System.out.println("Not same");
        }

        // equals()
        // it will check the value equality
        String movieA = new String("Balan");
        String movieB = new String("Balan");

        // Reference equality
        if(movieA == movieB) {
            System.out.println("Both strings are the same");
        } else {
            System.out.println("Not same");
        }

        // Value equality
        if(movieA.equals(movieB)) {
            System.out.println("Both strings have the same value");
        } else {
            System.out.println("Different values");
        }

        // String are immutable (Connot be changed)
        String country = "Kanada";
        System.out.println(country.charAt(0));
    }
}
