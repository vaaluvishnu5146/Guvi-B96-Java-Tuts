public class Encapsulation {
    public static void main(String[] args) {
        Customer customer = new Customer("Vishnu", 25, true, true, "Reading");

        // Get values
        System.out.println(customer.getName());
        System.out.println(customer.getAge());
        System.out.println(customer.getMale());
        System.out.println(customer.getVeg());
        System.out.println(customer.getHobbies());

        // Set values
        customer.setName("Vishnu Vardhan");
        customer.setAge(10);
        customer.setMale(false);
        customer.setVeg(false);
        customer.setHobbies("Writing, Coding");

        // Get values
        System.out.println(customer.getName());
        System.out.println(customer.getAge());
        System.out.println(customer.getMale());
        System.out.println(customer.getVeg());
        System.out.println(customer.getHobbies());


    }
}
