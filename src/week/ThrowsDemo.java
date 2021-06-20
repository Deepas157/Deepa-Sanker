package week;

import java.io.FileNotFoundException;

public class ThrowsDemo {
 static void throwsdemo() throws FileNotFoundException{
	 System.out.println("Inside throwdemo...");
	 throw new FileNotFoundException();
 }
	public static void main(String[] args) {
		try {
			throwsdemo();
		}
		catch(FileNotFoundException e) {
			System.out.println("Caught    "+e);
		}
	}
}
