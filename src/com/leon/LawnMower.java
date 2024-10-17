package com.leon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LawnMower {
	public static void main(String[] args) throws IOException {

		File inputDirectory = new File("C:/Users/leo/eclipse-workspace/lawnmower/input/level3/");
		String outputDirectory = "C:/Users/leo/eclipse-workspace/lawnmower/output/level3/";

		if (inputDirectory.isDirectory()) {

			File[] files = inputDirectory.listFiles((dir, name) -> name.endsWith(".in"));

			if (files != null) {
				int i = 1;
				for (File file : files) {
					if (file.isFile()) {
						FileManager fileManager = new FileManager();

						List<Lawn> lawns;

						try {
							lawns = fileManager.lawnList(file.getPath());

							BufferedWriter writer = new BufferedWriter(
									new FileWriter(outputDirectory + "output3_" + i + ".out"));

							for (Lawn lawn : lawns) {

								fileManager.writeValidValue(writer, lawn.validValue(lawn));
								// System.out.println(lawn.validValue(lawn));
							}

							writer.close();

						} catch (IOException e) { // TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					i++;
				}
			}
		}
	}
}
