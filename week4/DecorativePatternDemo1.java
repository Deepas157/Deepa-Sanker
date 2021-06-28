package week4;
public class DecorativePatternDemo1 {	
	public static void main(String[] args) {
		mall m = new MensGarment(new WomensGarment(new Fastfood()));
		System.out.println(m.go());
	}
}
abstract class mall{
	abstract String go();
}
abstract class DressShop extends mall{}
abstract class FoodShop extends mall{}
class MensGarment extends DressShop{
	mall path;
	public MensGarment(mall path) {
	path=this.path;	
	}
	String go() {
		if (path==null) {
			return"Go to mensgarement and return to home ";
		}else 
		    return " go to mens wear &"+path.go();
	}	
}
class WomensGarment extends DressShop{
	mall path;
	public WomensGarment(mall path) {
	path=this.path;	
	}
	String go() {
		if (path==null) {
			return"Go to womensgarement and return to home ";
		}else 
		    return " go to womens wear &"+path.go();
	}	
}
class Fastfood extends FoodShop{
	mall path;
	public Fastfood() {
	path=this.path;	
	}
	String go() {
		if (path==null) {
			return"Go to fastfood  and return to home ";
		}else 
		    return " go to fastfood &"+path.go();
	}	
}
class Traditionalfood extends FoodShop{
	mall path;
	public Traditionalfood (mall path) {
	path=this.path;	
	}
	String go() {
		if (path==null) {
			return"Go to traditional food  and return to home ";
		}else 
		    return " go to traditional food  &"+path.go();
	}	
}

