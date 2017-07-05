package packageone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteClass{
	
	public static void main(String args[]) throws IOException{
		FileWriter fr = new FileWriter("C://Users//Ritesh Puri//Desktop/test.txt");
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("Hi, I am writing in the file using BufferedWriter");
		br.close();
	}
}
