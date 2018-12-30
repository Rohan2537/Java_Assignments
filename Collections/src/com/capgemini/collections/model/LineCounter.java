/*	A Java LineCount Application:
	accept the complete path of a file from user and count the number of lines in that file and print it on the console.*/

package com.capgemini.collections.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.Assert;

/**
 * class which counts the  number of lines [present in the file;
 * @author Rohan Bhosale
 *
 */
public class LineCounter {
	
	public int linesCountInFile(String file) throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int lines = 0;
		while (reader.readLine() != null) 
		lines++;
		return lines;
	}
	
}

