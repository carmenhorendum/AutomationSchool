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
	}

	@Override
	public void play() {
		super.play();
	}
}
