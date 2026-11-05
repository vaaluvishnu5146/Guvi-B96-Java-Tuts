public class PatternsPrinting {
    public static void main(String[] args) {
        /**
         * Square fill technique
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * Right half pyramid technique
         */
        for (int i = 1; i <= 6; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
