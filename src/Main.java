//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 30;

        System.out.println(age);
//        String name = "Vishnu";
//        boolean isMale = true;
//        boolean isVeg = false;
//        // Declaration
//        String hobbies;
//        // Initilization
//        hobbies = "Mentoring, Eating";
//        System.out.println("My hobbies are " + hobbies);

        // Re-Initializing
//        hobbies = "Playing, Swimming";
//        System.out.println("My hobbies are " + hobbies);
//
//        System.out.println("Customer Name is " + name + " and his Age is " + age);


        // Object - Non-Primitive
        Customer customerA = new Customer("Vishnu Vardhan", 30, true, false, "Running, Walking, Eating");
        Customer customerB = new Customer("John Doe", 25, false, true, "Reading, Writing");

        System.out.println("Customer A name is " + customerA.name + " Age is " + customerA.age);
        System.out.println("Customer B name is " + customerB.name + " Age is " + customerB.age);

    }
}