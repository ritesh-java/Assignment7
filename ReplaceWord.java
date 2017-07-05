package packageone;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWord{
	
	public static void main(String args[]) throws IOException{
		FileReader f = new FileReader("C://Users//Ritesh Puri//Desktop/test.txt"); //My file has "Hi, I am writing in the file using BufferedWriter"
		BufferedReader br = new BufferedReader(f);
		String str = br.readLine();
		String atr1 = str.replace("BufferedWriter","BufferFeature");
		br.close();
		f.close();
		
		FileWriter fr = new FileWriter("C://Users//Ritesh Puri//Desktop/test.txt");
		BufferedWriter br1 = new BufferedWriter(fr);
		br1.write(atr1);
		br1.flush();
		br1.close();
	}
}
