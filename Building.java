public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor of super class Building
     * @param name name of the Building
     * @param address address of the Building
     * @param nFloors number of floors
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Accessor for the name of the Building
     * @return name of the Building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor for the address of the Building
     * @return address of the Building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor for the number of floors of the Building
     * @return number of floors of the Building
     */
    public int getFloors() {
        return this.nFloors;
    }

    
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address + ".";
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);

        Building sabinReed = new Building("Sabin Reed", "44 College Lane Northampton, MA 01063", 5);
        System.out.println(sabinReed);


    }

}
