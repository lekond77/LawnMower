package com.leon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	public List<Lawn> lawnList(String path) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), "UTF-8"));

		reader.readLine();

		List<Lawn> lawns = new ArrayList<Lawn>();

		while (reader.ready()) {

			int[] dimension = getDimentions(reader.readLine());

			int width = dimension[0];
			int height = dimension[1];

			Lawn lawn = new Lawn();
			Direction direction = new Direction();
			lawn.setWidth(width);
			lawn.setHeight(height);

			String line = "";

			for (int i = 0; i < height; i++) {
				line += reader.readLine();
			}

			char[] lines = line.toCharArray();

			lawn.setCells(lines);
			direction.setDirections(reader.readLine());
			lawn.setDirection(direction);

			lawns.add(lawn);
		}

		reader.close();
		return lawns;
	}

	private static int[] getDimentions(String line) {
		String[] lineArray = line.split(" ");
		return new int[] { Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]) };
	}

	public void writeValidValue(BufferedWriter writer, String validValue) throws IOException {
		writer.write(validValue);
		writer.newLine();
	}
}
