package com.theatre.theatreclass;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

	private String theatreName;
	private List<Seats> seat;
	private int numberOfRows;
	private int numberOfSeats;

	public Theatre() {

	}

	public Theatre(String theatreName, List<Seats> seat, int numberOfRows, int numberOfSeats) {
		this.theatreName = theatreName;
		this.seat = new ArrayList<>();
		this.numberOfRows = numberOfRows;
		this.numberOfSeats = numberOfSeats;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public List<Seats> getSeat() {
		return seat;
	}

	public void setSeat(List<Seats> seat) {
		this.seat = seat;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
}
