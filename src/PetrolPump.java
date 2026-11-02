public class PetrolPump {
    public static void main(String[] args) {
        Petrol e2petrol = new Petrol("PALE YELLOW", "E20", 107.10); // A
        Petrol normPetrol = new Petrol("PALE YELLOW", "NORMAL", 107.00); // B
        Petrol speedPetrol = new Petrol( "YELLOW", "SPEED", 110.00); // C

        // Printing the petrol object
        System.out.println(e2petrol.type + " " + e2petrol.color + " " + " " + e2petrol.price + " " + Petrol.UNIT);
        System.out.println(normPetrol.type + " " + normPetrol.color + " " + " " + normPetrol.price + " " + Petrol.UNIT);
        System.out.println(speedPetrol.type + " " + speedPetrol.color + " " + " " + speedPetrol.price + " " + Petrol.UNIT);

        // Access the calculatePetrol method
        System.out.println("Price for 10 liters of E20 petrol: " + Petrol.calculatePetrolPrice(10, e2petrol.price));
        System.out.println("Price for 10 liters of NORMAL petrol: " + Petrol.calculatePetrolPrice(normPetrol.price, 10));
        System.out.println("Price for 10 liters of SPEED petrol: " + Petrol.calculatePetrolPrice(10, speedPetrol.price));

    }
}