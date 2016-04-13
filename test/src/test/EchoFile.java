package test;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class EchoFile {
	public static void main(String[] args)throws IOException{
		int number;
		File inputFile=new File("src/input.txt");
		Scanner s=new Scanner(inputFile);
		
		while(s.hasNext()){
			number=s.nextInt();
			System.out.println(number);
		}
		s.close();
		System.out.println("EOF");
	}
	//add comment
	//connneeett
}
