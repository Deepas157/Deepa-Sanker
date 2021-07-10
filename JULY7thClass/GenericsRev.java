package JULY7thClass;

public class GenericsRev {
	public static void main(String[] args) {
	child<ball>ch=new child<>();
	ch.setObj(new ball());
	ch.getObj().play();
	child<sweet>ch1=new child<>();
	ch1.setObj(new sweet());
	ch1.getObj().eat();
	}
}
class ball{
	ball b;
	public void play() {
		System.out.println("play with ball....");
	}
}
class sweet{
	sweet s;
	public void eat() {
		System.out.println("eat the sweet....");
	}
}
class child<S>{
	S obj;
	public void setObj(S obj) {
		this.obj=obj;
	}
	public S getObj() {
		return this.obj;
	}
	
}
