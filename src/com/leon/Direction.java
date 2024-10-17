package com.leon;

public class Direction {

	private String directions;

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}
	
	public char[] directionsArray() {
		
		return directions.toCharArray();
	}
	
}
