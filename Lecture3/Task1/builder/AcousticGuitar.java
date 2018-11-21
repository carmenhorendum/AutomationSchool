package builder;

public class AcousticGuitar extends Guitar {
    private String soundhole;

    public String getSoundhole() {
        return soundhole;
    }

    public void setSoundhole(String soundhole) {
        this.soundhole = soundhole;
    }

    @Override
    public void play() {
        System.out.println("Gruppa krovi na rukave...");
    }
}
