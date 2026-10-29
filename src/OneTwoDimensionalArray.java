public class OneTwoDimensionalArray {
    public static void main(String[] args) {
        // 1 Dimensional Array = 1 Row and 5 columns
        int[] maths = { 100, 99, 88, 100, 50 };

        System.out.println("Maths length = " + maths.length);

        // Length = Total number of elements inside the array
        for (int i = 0; i < maths.length; i++) {
            System.out.println("Element " + i + ": " + maths[i]);
        }

        // 2 Dimensional Array = 5 Rows and 5 columns
        int[][] marks = {
                {50, 45, 38, 45, 80},
                {100, 98, 65, 76, 100},
                {50, 45, 38, 45, 80},
                {100, 98, 65, 76, 100},
                {50, 45, 38, 45, 80}
        };

        for (int j = 0; j < marks.length; j++) {
            for(int k = 0; k < marks[j].length; k++) {
                System.out.print(marks[j][k] + " ");
            }
            System.out.println();
        }

        // Explicity tell the size of one d and two d array
        int[] a = new int[10];
        int[][] b = new int[10][10];

        // Enhanced For Loop
        int[] age = { 20, 18, 17, 15, 30 };

        // Normal or Index based for loop
        for(int i = 0; i < age.length; i++) {
            System.out.println("Element " + i + ": " + age[i]);
        }

        for(int i: age) {
            System.out.println("Element: " + i);
        }

    }
}
