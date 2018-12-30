/*	1) A Java FileExist Application
	accept the complete path of a file from the user and display whether the file exist or not.*/

package com.capgemini.collections.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

public class TestFileExists {

	/**
	 * test to check for file exists -True condition;
	 * @throws IOException 
	 */
	@Test
	public void testToCheckIfFileExistsTrueCondition()throws IOException  {
		FileExist fileOne = new FileExist();
		boolean actual = fileOne.checkFileExists("/Users/rohabhos/workspace/Collections/UserDemo.txt");
		assertEquals(true, actual);
		
	}

	/**
	 * test to check for file exists -False condition;
	 * @throws IOException 
	 */
	@Test
	public void testToCheckIfFileExistsFalseCondition() throws IOException {
		FileExist fileOne = new FileExist();
		assertEquals(true, fileOne.checkFileExists("/Users/rohabhos/workspace/Collections/UserDemo.txt"));
	}

}
