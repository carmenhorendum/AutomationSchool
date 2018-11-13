package packFour;

import java.util.List;

public class Runner {
	private String name;
	private int time;
	private int place;

	public Runner(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public int getPlace() {
		return place;
	}
}
