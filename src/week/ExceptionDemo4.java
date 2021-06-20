package week;

class InvalidCardException extends Exception{ 
	 String msg; 
	public InvalidCardException(String msg) { 
	 this.msg=msg; 
	 } 
	 
	@Override
	public String toString() { 
	 return "Exception is..:"+msg; 
	 } 
	}
public class ExceptionDemo4 {
	public static void main(String[] args) {
		ATM obj=new ATM();
		try {
			obj.insertcard("valid");
		}catch(InvalidCardException e) {
			System.out.println(e);
			System.out.println("logic for invalid card..");
			System.out.println("normal transaction...");
		}
	}
}
class ATM{
	public void insertcard(String cardvalidity)throws InvalidCardException {
		if (cardvalidity.equals("valid")) {
			System.out.println("I will process the card ...");
		}
		else {
			throw new InvalidCardException ("you have inserted a invalid card");
		}
	}
}
