public class ConditionalStatements {
    public static void main(String[] args) {
        boolean money = false;
        if (money) {
            System.out.println("I will eat happily!");
        } else {
            System.out.println("I will drink water happily!");
        }

        int pocketMoney = 500;
        if (pocketMoney < 1) {
            System.out.println("I will drink water happily!");
        } else if (pocketMoney >= 50 && pocketMoney <= 100) {
            System.out.println("I will eat shawarma!");
        } else if (pocketMoney >= 101 && pocketMoney <= 200) {
            System.out.println("I will eat pizza!");
        } else {
            System.out.println("I am King, i will eat anything!");
        }

        String storedPassword = "Vishnu";
        String enteredPassword = "Vishnu";

//         ==
//         equals()
        if (storedPassword.equals(enteredPassword)) {
            System.out.println("Password is correct!");
        } else {
            System.out.println("Password is incorrect!");
        }

        String type = "idli";
        // Switch Statement
        switch (type) {
            case "shawarma":
                System.out.println("Price = 90");
                break;
            case "pizza":
                System.out.println("Price = 150");
                break;
            default:
                System.out.println("Item not found");
                break;
        }

    }
}
