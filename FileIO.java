package com.cg.day1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileIO {
public static void main(String[] args) throws IOException {
	FileWriter fstream = new FileWriter("newfile.txt");
    BufferedWriter out = new BufferedWriter(fstream);
	File file = new File("newfile.txt");
	try {
		manipulate(file);
	} catch (FileNotFoundException | UnsupportedEncodingException e) {
		
		e.printStackTrace();
	}
	
	
	
}

private static void manipulate(File file) throws FileNotFoundException, UnsupportedEncodingException {

	PrintWriter writer =new PrintWriter("newfile.txt",  "UTF-8");
	writer.write("Hello!! Welcome to capgemini");
	writer.close();
	
}
}
