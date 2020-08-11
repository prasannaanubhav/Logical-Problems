package com.theatre.theatreclass;

public class Main {

	public static void main(String[] args) {

		Theatre theatre = new Theatre();
		theatre.setNumberOfRows(8);
		theatre.setNumberOfSeats(12);
		theatre.setTheatreName("INOX");
		ServiceImplementaion serviceImplementaion = new ServiceImplementaion();

		serviceImplementaion.createListOfSeats(theatre.getNumberOfRows(), theatre.getNumberOfSeats());
//		serviceImplementaion.getListOfSeats();
		boolean returnValue = serviceImplementaion.isReserved2("H11");
//		System.out.println(returnValue);
		System.out.println();
		boolean returnValu2 = serviceImplementaion.isReserved2("H11");
//		System.out.println(returnValu2);

	}

}
