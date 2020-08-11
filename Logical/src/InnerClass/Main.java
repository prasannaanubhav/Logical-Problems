package InnerClass;

public class Main {

	public static void main(String[] args) {

		GearBox gearBox = new GearBox(5, "Shelby American");
		gearBox.getcarName();
		GearBox.Gear gear = gearBox.new Gear(2, 46);
		gear.getSpeed();

	}

}
