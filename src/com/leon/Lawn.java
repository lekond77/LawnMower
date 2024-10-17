package com.leon;

import java.util.Arrays;

public class Lawn {

	private int width; // Width of the lawn
	private int height; // Height of the lawn
	private char[] cells; // Array representing the cells of the lawn
	private Direction direction; // Current direction

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char[] getCells() {
		return cells;
	}

	public void setCells(char[] cells) {
		this.cells = cells;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	// Calculates the size of the lawn
	public int size() {
		return width * height;
	}

	// Checks if the path is traversable
	private boolean isPathTraversable() {
		return direction.getDirections().length() == size() - 2;
	}

	// Checks if the cell is a tree cell
	private boolean isTreeCell(char direction) {
		return direction == 'X';
	}

	// Checks if the cell has been visited
	private boolean hasCellBeenVisited(char direction) {
		return direction == '\0';
	}

	public String validValue(Lawn lawn) {

		if (!isPathTraversable()) {
			return "INVALID";
		}

		for (int i = 0; i < lawn.size(); i++) {

			int x = i;
			int countTraversalCel = 0;

			boolean isValid = false;

			// Create a copy of lawn.cells at the beginning of each iteration
			char[] lawnCell = Arrays.copyOf(lawn.cells, lawn.size());
	
			
			for (char direction : lawn.getDirection().directionsArray()) {

				if (isTreeCell(lawnCell[x])) {
					break;
				} else {
					lawnCell[x] = '\0';
				}

				switch (direction) {

				case 'D': // Move to right
					if ((x + 1) % lawn.width != 0) {
						isValid = true;
						x++;
					} else {
						isValid = false;
					}
					break;

				case 'A': // Move to left
					if (x % lawn.width != 0) {
						isValid = true;
						x--;
					} else {
						isValid = false;
					}
					break;
					
				case 'W': // Move to up
					x -= lawn.width;
					if (x >= 0 && x < lawn.size()) {
						isValid = true;
					} else {
						isValid = false;
					}
					break;
					
				case 'S': // Move to down
					x += lawn.width;

					if (x >= 0 && x < lawn.size()) {
						isValid = true;
					} else {
						isValid = false;
					}
					break;

				}

				if (isValid) {
					countTraversalCel++;
				} else {
					break;
				}

				if (hasCellBeenVisited(lawnCell[x])) {
					break;
				}
			}

			//System.out.println(lawnCell);
			if (countTraversalCel + 2 == lawn.size()) {
				return "VALID";
			}
		}
		return "INVALID";
	}

}

