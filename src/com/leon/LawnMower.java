package com.leon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LawnMower {
	public static void main(String[] args) throws IOException {

		File inputDirectory = new File("C:/Users/leo/eclipse-workspace/lawnmower/input/level2/");
		String outputDirectory = "C:/Users/leo/eclipse-workspace/lawnmower/output/level2/";

		if (inputDirectory.isDirectory()) {

			File[] files = inputDirectory.listFiles();
			
			if (files != null) {
				int i = 1;
				for (File file : files) {
					if (file.isFile()) {

						List<String> directions;
						try {
							directions = readInputLine(file.getPath());

							writeOuput(outputDirectory + "output2_" + i + ".out", directions);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					i++;
				}
			}
		}
	}

	private static int[] calculateRectangleSize(String directions) throws IOException {
		int x = 0, y = 0;
		int minX = 0, maxX = 0, minY = 0, maxY = 0;

		for (char direction : directions.toCharArray()) {

			switch (direction) {
			case 'W':
				y++;
				break;
			case 'A':
				x--;
				break;
			case 'S':
				y--;
				break;
			case 'D':
				x++;
				break;
			}
			minX = Math.min(minX, x);
			maxX = Math.max(maxX, x);
			minY = Math.min(minY, y);
			maxY = Math.max(maxY, y);
		}

		int width = maxX - minX + 1;
		int height = maxY - minY + 1;

		return new int[] { width, height };
	}

	private static List<String> readInputLine(String path) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), "UTF-8"));

		reader.readLine();

		List<String> directions = new ArrayList<String>();

		while (reader.ready()) {
			String line = reader.readLine();

			directions.add(line);
		}

		reader.close();
		return directions;
	}

	private static void writeOuput(String path, List<String> directions) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(path));

		for (String direction : directions) {
			int[] dimensions;
			dimensions = calculateRectangleSize(direction);

			writer.write(dimensions[0] + " " + dimensions[1]);
			writer.newLine();
		}

		writer.close();

	}
}
