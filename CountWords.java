package packageone;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords{
	
	public static void main(String args[]) throws IOException{
		FileReader f = new FileReader("C://Users//Ritesh Puri//Desktop/test.txt"); //My file has "Hi, I am writing in the file using BufferedWriter"
		BufferedReader br = new BufferedReader(f);
		String str = br.readLine();
		String arr = str.replace(",","");
		System.out.println(arr);
		String strar[] = arr.split(" ");
		System.out.println("Number of words in a file: "+strar.length);
		}
}
