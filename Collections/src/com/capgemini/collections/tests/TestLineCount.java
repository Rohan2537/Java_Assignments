/*	A Java LineCount Application:
	accept the complete path of a file from user and count the number of lines in that file and print it on the console.*/

package com.capgemini.collections.tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class TestLineCount {
	/**
	 * test to count the number of lines in the specified file;
	 * @throws IOException
	 */
	@Test
	public void countingNumberOfLines() throws IOException{
	LineCounter lineCounter = new LineCounter();
	try{
		int actual =  lineCounter.linesCountInFile("/Users/rohabhos/workspace/Collections/UserDemo.txt");
		assertEquals(2,actual);
	}
	catch(IOException e){
		e.printStackTrace();
	}
 }
	/**
	 * throws exception if specified file is not present;
	 * @throws IOException
	 */
	@Test
	public void countingNumberOfLinesAndThrowsException() throws IOException{
	LineCounter lineCounter = new LineCounter();
	try{
		int actual =  lineCounter.linesCountInFile("/Users/rohabhos/workspace/Collections/UserDemoOne.txt");
		assertEquals(2,actual);
	}
	catch(IOException e){
		e.printStackTrace();
	}
 }
}