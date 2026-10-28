public class Loops {
    public static void main(String[] args) {
        /*
         * Prints 1 to 5
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("End of Loop 1");
        /*
         * Prints 5 to 1
         */
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("End of Loop 2");

        /**
         * Jump 2 steps
         */
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("End of Loop 3");

        /**
         * Nested loops
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }

        // Continue statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("While loops");

        /**
         * While Loops -> Print 1 to 5
         */
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i = i + 1;
        }

        /**
         * While Loops -> Print 1 to 5
         */
        int j = 5;
        while (j >= 1) {
            System.out.println(j);
            j = j - 1;
        }


        System.out.println("DO WHILE LOOPS");

        /**
         * do while loops
         */

        System.out.println("DO WHILE LOOPS +ve case");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        System.out.println("DO WHILE LOOPS -ve case");

        int l = 10;
        do {
            // System.out.println(l);
            l--;
        } while (l <= 5);

        /**
         * print 9, 19, 29, .... 99
         */
        for (int a = 9; a <= 100; a = a + 10) {
            System.out.println(a);
        }

    }
}
