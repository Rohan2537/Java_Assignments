/*	3) A Java WordCount Application:
	accept the path of a file from user and count the number of words in that file and print it on the console.*/

package com.capgemini.collections.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	/**
	 * Method to count the number of words present in the file;
	 * @param path
	 * @return numberOfWords;
	 * @throws IOException
	 */
	public int countNumberOfWordsInFile(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String lines = "";
		int numberOfWords = 0;
		
		while ((lines=reader.readLine()) != null) {
			if (!lines.equals("")) {
				String[] arrayOfWords = lines.split(" ");
				numberOfWords += arrayOfWords.length;

				for (String words : arrayOfWords) {
					System.out.println(words);
				}
			}
		}

		return numberOfWords;
	}
}
