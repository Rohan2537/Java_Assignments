/*	3) A Java WordCount Application:
	accept the path of a file from user and count the number of words in that file and print it on the console.*/

package com.capgemini.collections.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestWordCount {

/**
 * returns the count of words present in the file; 
 * @throws IOException
 */
	@Test
	public void testToCountTheWordsInTheFileValidCase()throws IOException {
		WordCount file = new WordCount();
		try {
			assertEquals(2,file.countNumberOfWordsInFile("/Users/rohabhos/workspace/Collections/UserDemo.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/**
 * test throws exception if count is incorrect;
 * @throws IOException
 */
	@Test
	public void testToCountTheWordsInTheFileThrowsException()throws IOException {
		WordCount file = new WordCount();
		try {
			assertEquals(1,file.countNumberOfWordsInFile("/Users/rohabhos/workspace/Collections/WordCount.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
