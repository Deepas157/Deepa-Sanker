package week2;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		String personplay;
		String computerplay=null;
		int computerInt;
		System.out.println("START....");
		Scanner scan=new Scanner(System.in);
		personplay=scan.nextLine();
		scan.close();
		Random generator=new Random();
		int limit=3;
		int random=generator.nextInt(limit);
		switch(random) {
		case 0:computerplay="R";
		break;
		case 1:computerplay="p";
		break;
		case 2:computerplay="S";
		break;
		}
		if(personplay.equals(computerplay)) {
		System.out.println("..same choice..try again..");
	}
		else if(personplay.equalsIgnoreCase("R")&&computerplay.equalsIgnoreCase("s")) {
				System.out.println("person won the match....");
			}
		else if (personplay.equalsIgnoreCase("R")&&computerplay.equalsIgnoreCase("P")){
			System.out.println("system won the match...");
		}
		else if(personplay.equalsIgnoreCase("S")&&computerplay.equalsIgnoreCase("R")) {
			System.out.println("system won the match...");
		}
		else if (personplay.equalsIgnoreCase("s")&&computerplay.equalsIgnoreCase("p")) {
			System.out.println("you won the match...");
		}
		else if (personplay.equalsIgnoreCase("p")&&computerplay.equalsIgnoreCase("s")) {
			System.out.println("system won the match...");
		}
		else if (personplay.equalsIgnoreCase("p")&&computerplay.equalsIgnoreCase("r")) {
			System.out.println("you won the match...");
		}
}   
}