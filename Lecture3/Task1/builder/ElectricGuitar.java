package builder;

public class ElectricGuitar extends Guitar {
    private String pickup;

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void plug() {
        System.out.println("Plugging to the amp...");
    }

    @Override
    public void play() {
        System.out.println("New blood joins this earth...");
    }
}
