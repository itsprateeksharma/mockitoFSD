package streamdemo;

public class MusicalInstruments {

	private String name;
	private String type;
	private double price;
	
	public MusicalInstruments(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "MusicalInstruments [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
	
	
}
