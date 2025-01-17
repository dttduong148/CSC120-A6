/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor for class Cafe
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;

        System.out.println("You have built a cafe: ☕");
    }
    
    /**
     * Method to sell coffee and decrease the amount/number of coffee, sugar packets, cream pumps, and cups.
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        if (this.nCoffeeOunces == 100 & this.nSugarPackets == 20 & this.nCreams == 140 & this.nCups == 20) {
            this.restock(1000, 200, 1400, 200);
        }
    }

    /**
     * Method to refill the amount/number of coffee, sugar packets, cream pumps, and cups.
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    public String toString() {
        return("Coffee: " + this.nCoffeeOunces
        + " Sugar Packets: " + this.nSugarPackets
        + " Cream: " + this.nCreams
        + " Cups: " + this.nCups);
    }

    public static void main(String[] args) {
        Cafe Compass = new Cafe("Compass", "Neilson Drive", 4, 
        5000, 1000, 7000, 1000);

        while (true) {
            Compass.sellCoffee(5, 1, 7);
            System.out.println(Compass);
        }
    }   
}
