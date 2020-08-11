package com.theatre.theatreclass;

public class Seats implements Comparable<Seats> {

	private String seatNumber;
	private boolean reservedSeat = false;

	public Seats() {

	}

	public Seats(String seatNumber,boolean reservedSeat) {
		this.seatNumber = seatNumber;
		this.reservedSeat = reservedSeat;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isReservedSeat() {
		return reservedSeat;
	}

	public void setReservedSeat(boolean reservedSeat) {
		this.reservedSeat = reservedSeat;
	}

	@Override
	public int compareTo(Seats seats) {

		return this.seatNumber.compareToIgnoreCase(seats.getSeatNumber());
	}

}
