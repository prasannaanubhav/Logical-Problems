package com.theatre.theatreclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceImplementaion {

	private static Seats seats = new Seats();
	private static Theatre theatre = new Theatre();

	public void createListOfSeats(int numOfRows, int seatNumber) {

		List<Seats> seatnum = new ArrayList<>();
		int lastRow = 'A' + (numOfRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seat = 1; seat < seatNumber; seat++) {
				Seats seats = new Seats(row + String.format("%02d", seat),false);
				seats.setReservedSeat(false);
				seatnum.add(seats);
			}
		}
		theatre.setSeat(seatnum);

	}

	public void getListOfSeats() {
		List<Seats> seatnum = theatre.getSeat();
		for (Seats seats : seatnum) {
			System.out.println(seats.getSeatNumber());
		}

	}

	public boolean isReserved(String seatNumber) {
		List<Seats> seatnum = theatre.getSeat();
		for (Seats seats : seatnum) {
			System.out.print(".");
			if (seats.getSeatNumber().equals(seatNumber)) {
				if (!seats.isReservedSeat()) {
					seats.setReservedSeat(true);
					System.out.println("Seat is not reserved");
					return false;
				}
			}
		}
		System.out.println("Seat is reserved");
		return true;

	}
	
	public boolean isReserved2(String seatNumber) {
		List<Seats> seatnum = theatre.getSeat();
		seats.setSeatNumber(seatNumber);
		int foundValue = Collections.binarySearch(seatnum, seats, null);
		if(foundValue>0) {
			System.out.print(".");
				if (!seats.isReservedSeat()) {
					seats.setReservedSeat(true);
					System.out.println("Seat is not reserved");
					return false;
				}
		}
		System.out.println("Seat is reserved");
		return true;

	}

}
