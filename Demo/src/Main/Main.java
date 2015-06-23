package Main;
import parts.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello!!!");
		Engine x = new Engine(23.0,"GTC");
		System.out.println("New Engine: " + x.getModel() + "  " + x.getHorsePower());
	}

}
