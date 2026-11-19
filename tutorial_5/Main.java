package tutorial_5;

public class Main {
    public static void main(String[] args) {
        // Create the 4 appliances
        Appliance wm = new WashingMachine("LG");
        Appliance fridge = new Refrigerator("Panasonic");
        Appliance ac = new AirConditioner("Daikin");
        Appliance mw = new Microwave("Samsung");

        // Run each appliance
        Appliance[] list = { wm, fridge, ac, mw };

        for (Appliance item : list) {
            item.displayBrand();
            item.turnOn();
            item.operate();
            item.turnOff();
            System.out.println(); // Blank line
        }
    }
}