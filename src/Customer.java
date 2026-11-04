public class Customer {
    // Attributes
    private int age;
    private String name;
    private boolean isMale;
    private boolean isVeg;
    private String hobbies;

    // Constructor
    public Customer(String name, int age, boolean isMale, boolean isVeg, String hobbies) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.isVeg = isVeg;
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean getVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
