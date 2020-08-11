package OOPS;

public class Main {

	public static void main(String[] args) {
		
		House blueHouse = new House("BLUE");
		House anotheHouse = new House("Yellow");
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotheHouse.getColor());
		
		anotheHouse.setColor("Green");
		System.out.println(anotheHouse.getColor());
		System.out.println(blueHouse.getColor());
		

	}

}
