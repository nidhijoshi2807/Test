package com.java.code;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("input.txt");
		FileWriter oFile = new FileWriter("output.txt");
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String str = sc.nextLine();
				StringBuffer buffer = new StringBuffer(str);
				buffer = buffer.reverse();
				String result = buffer.toString();
				oFile.write(result);
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		file.close();
		oFile.close();	
	}
}
