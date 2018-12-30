/*	1) A Java FileExist Application
	accept the complete path of a file from the user and display whether the file exist or not.*/

package com.capgemini.collections.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * @author Rohan Bhosale;
 *class to check if file exists using class File;
 */
public class FileExist {
		
	public boolean checkFileExists(String file) throws IOException{
	
		File fileOne = new File(file);
		return fileOne.exists();
	}

}