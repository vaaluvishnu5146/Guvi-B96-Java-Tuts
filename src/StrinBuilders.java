public class StrinBuilders {
    public static void main(String[] args) {

        String name = "Vishnu Vardhan";
        String designation = "student";

        StringBuilder leaveLetterBuilder = new StringBuilder("");

        leaveLetterBuilder
                .append("Myself ")
                .append(name);

        if (designation == "student") {
            leaveLetterBuilder.append(", enrolled in guvi as a  " );
        } else {
            leaveLetterBuilder.append(", working as a  " );
        }

        leaveLetterBuilder.append(designation)
                .append("\n. Today i dont feel like working,\n")
                .append("So i would take a day off for recovery.\n" +
                        "\n" +
                        "Thanks.");

        System.out.println(leaveLetterBuilder);


        // Replace
        StringBuilder sb = new StringBuilder("Hello Java");
        sb.replace(6, 10, "Vishnu");

        System.out.println(sb);

        sb.delete(5, 12);
        System.out.println(sb);

    }
}
