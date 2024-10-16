package com.leon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LawnMower {
	
	public static void main(String[] args) {

		try {

			//input output directory
			File inputDirectory = new File("C:/Users/leo/eclipse-workspace/lawnmayer/input/level1/");
			String outputDirectory = "C:/Users/leo/eclipse-workspace/";

			if (inputDirectory.isDirectory()) {

				File[] files = inputDirectory.listFiles();

				if (files != null) {
					int i = 1;
					for (File file : files) {
						if (file.isFile()) {
							readInput(file.getPath(), outputDirectory + "output1_" + i + ".out");			
							i++;
						}
					}
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static void readInput(String inputPath, String outputPath) throws IOException {

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(inputPath)), "UTF-8"));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

		reader.readLine();

		char[] directions = { 'W', 'D', 'S', 'A' };

		//We browse the file as long as it’s not empty.
		while (reader.ready()) {

			String line = reader.readLine(); // read line

			char[] charArray = line.toCharArray(); 

			Map<Character, Integer> charCountMap = new HashMap<>();

			for (char character : charArray) {
				charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
			}

			for (char direction : directions) {

				int value = charCountMap.getOrDefault(direction, 0);

				
				writer.write(value + " ");
			}
			writer.newLine();

		}

		reader.close();
		writer.close();

	}
}
