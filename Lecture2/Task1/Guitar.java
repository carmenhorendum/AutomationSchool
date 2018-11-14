public class Guitar {
	private String brand, bodyShape, bodyConstruction, bodyWood, neckJoint, neckWood, headstock,
			fretboardWood, tunersType, tunersConfiguration, bridgeType, pickupsType,
			pickupsBrand, color;
	private int stringsCount, stringsGauge, fretsCount, pickupsCount;
	private double scaleLenght, weight;

	public Guitar() {
		this.brand = brand;
		this.bodyShape = bodyShape;
		this.bodyConstruction = bodyConstruction;
		this.bodyWood = bodyWood;
		this.neckJoint = neckJoint;
		this.neckWood = neckWood;
		this.headstock = headstock;
		this.fretboardWood = fretboardWood;
		this.tunersType = tunersType;
		this.tunersConfiguration = tunersConfiguration;
		this.bridgeType = bridgeType;
		this.pickupsType = pickupsType;
		this.pickupsBrand = pickupsBrand;
		this.color = color;
		this.stringsCount = stringsCount;
		this.stringsGauge = stringsGauge;
		this.fretsCount = fretsCount;
		this.pickupsCount = pickupsCount;
		this.scaleLenght = scaleLenght;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBodyShape() {
		return bodyShape;
	}

	public void setBodyShape(String bodyShape) {
		this.bodyShape = bodyShape;
	}

	public String getBodyConstruction() {
		return bodyConstruction;
	}

	public void setBodyConstruction(String bodyConstruction) {
		this.bodyConstruction = bodyConstruction;
	}

	public String getBodyWood() {
		return bodyWood;
	}

	public void setBodyWood(String bodyWood) {
		this.bodyWood = bodyWood;
	}

	public String getNeckJoint() {
		return neckJoint;
	}

	public void setNeckJoint(String neckJoint) {
		this.neckJoint = neckJoint;
	}

	public String getNeckWood() {
		return neckWood;
	}

	public void setNeckWood(String neckWood) {
		this.neckWood = neckWood;
	}

	public String getHeadstock() {
		return headstock;
	}

	public void setHeadstock(String headstock) {
		this.headstock = headstock;
	}

	public String getFretboardWood() {
		return fretboardWood;
	}

	public void setFretboardWood(String fretboardWood) {
		this.fretboardWood = fretboardWood;
	}

	public String getTunersType() {
		return tunersType;
	}

	public void setTunersType(String tunersType) {
		this.tunersType = tunersType;
	}

	public String getTunersConfiguration() {
		return tunersConfiguration;
	}

	public void setTunersConfiguration(String tunersConfiguration) {
		this.tunersConfiguration = tunersConfiguration;
	}

	public String getBridgeType() {
		return bridgeType;
	}

	public void setBridgeType(String bridgeType) {
		this.bridgeType = bridgeType;
	}

	public String getPickupsType() {
		return pickupsType;
	}

	public void setPickupsType(String pickupsType) {
		this.pickupsType = pickupsType;
	}

	public String getPickupsBrand() {
		return pickupsBrand;
	}

	public void setPickupsBrand(String pickupsBrand) {
		this.pickupsBrand = pickupsBrand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStringsCount() {
		return stringsCount;
	}

	public void setStringsCount(int stringsCount) {
		this.stringsCount = stringsCount;
	}

	public int getStringsGauge() {
		return stringsGauge;
	}

	public void setStringsGauge(int stringsGauge) {
		this.stringsGauge = stringsGauge;
	}

	public int getFretsCount() {
		return fretsCount;
	}

	public void setFretsCount(int fretsCount) {
		this.fretsCount = fretsCount;
	}

	public int getPickupsCount() {
		return pickupsCount;
	}

	public void setPickupsCount(int pickupsCount) {
		this.pickupsCount = pickupsCount;
	}

	public double getScaleLenght() {
		return scaleLenght;
	}

	public void setScaleLenght(double scaleLenght) {
		this.scaleLenght = scaleLenght;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void tune() {

	}

	public void play() {

	}

	@Override
	public String toString() {
		return "Guitar{" +
				"brand='" + brand + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
