public class TypeCastingPractice {
    public static void main(String[] args) {

        short ageShort = 30;

        System.out.println("Age short is = " + ageShort);

        int age = 30;

        System.out.println("Age is = " + age);

        long ageLong = age;

        System.out.println("Age long is = " + ageLong);

        double ageCopy = age;

        System.out.println("Age copy is = " + ageCopy);

        float ageCopyFloat = age;

        System.out.println("Age copy is = " + ageCopyFloat);

        double exactPrice = 99.89;
        int roundedPrice = (int) exactPrice; // Drops .89 completely -> 99
        System.out.println("Truncated price: " + roundedPrice);

    }
}
