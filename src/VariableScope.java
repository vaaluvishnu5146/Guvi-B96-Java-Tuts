public class VariableScope {
    public static String a = "Hello";

    public void print() {
        String message = "Tiger Ka huKum!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        String GANGSTER = "SJ Surya";

        // Scope  = World
        System.out.println("International" + GANGSTER);

        // // Scope  = India
        if (true) {
            System.out.println("India");
            String HERO = "TIGER MUTHUVEL PANDIAN";
            System.out.println(GANGSTER);
            System.out.println(HERO);

            // Scope = State
            if (true) {
                System.out.println("State");
                String LOCAL_GUNDAS = "2 People";
                System.out.println(GANGSTER);
                System.out.println(HERO);
                System.out.println(LOCAL_GUNDAS);

                // Scope - Town
                if (true) {
                    System.out.println("Town");
                    String LOCAL_HERO = "Murthy Anna";
                    System.out.println(GANGSTER);
                    System.out.println(HERO);
                    System.out.println(LOCAL_GUNDAS);
                    System.out.println(LOCAL_HERO);
                }
            }

        }
    }
}
