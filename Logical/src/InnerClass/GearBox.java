package InnerClass;

public class GearBox {

	private int numberOfGears;
	private String carName;

	public GearBox() {

	}

	public GearBox(int numberOfGears, String carName) {
		this.numberOfGears = numberOfGears;
		this.carName = carName;
	}
	
	public void getcarName() {
		System.out.println(this.carName);
	}
	
	public class Gear{
		
		private int gear;
		private int speed;
		
		public Gear() {
			
		}

		public Gear(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		}
		
		public void getSpeed() {
			
			System.out.println(this.gear*this.speed);
		}
		
	}

}
