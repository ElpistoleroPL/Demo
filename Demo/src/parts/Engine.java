package parts;

public class Engine {
	
	public Engine(double horsePower, String model) {
		super();
		this.horsePower = horsePower;
		this.model = model;
	}

	private double horsePower;
	private String model;
	
	public Engine(){}

	public double getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
