package week;

abstract class item{
	abstract public int cost();
}
abstract class cream extends item{
}
abstract class ingedients extends item{
}
class vanilla extends cream{
	item item;
	public vanilla() {
	}
	public vanilla(item item) {
		this.item=item;
	}
	public int cost() {
		if(item==null) {
	       return 15;
		}else 
			return (15+item.cost());
	}
}
class butterstoch extends cream{
	item item;
    public butterstoch() {	
	}
    public butterstoch(item item) {
		this.item=item;
	}
	public int cost() {
		if(item ==null) {
			return 20;
		}else 
		return (20+item.cost());
	}}
class nuts extends ingedients {
		item item;
		public nuts() {
			
		}
	    public nuts(item item) {
			this.item=item;
		}
		public int cost() {
			if(item ==null) {
				return 5;
			}else
			return (5+item.cost());
		}
}
class dryfruits extends ingedients{
		item item;
		public dryfruits() {
			
		}
		public dryfruits(item item) {
			this.item=item;
		}
		public int cost() {
			if(item==null) {
				return 19;
			}else
			return (19+item.cost());
		}}

public class AbstractDemo {
	public static void main(String[] args) {
		item icecream=new vanilla((new nuts(new butterstoch(new dryfruits()))));
		System.out.println("the cost of icecream is \t"+icecream.cost());
	}
}

