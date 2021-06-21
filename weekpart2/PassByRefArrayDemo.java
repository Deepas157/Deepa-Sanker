package weekpart2;

public class PassByRefArrayDemo {
	static int classvariable;
	int instancevariable;
	static int arr []=new int[5];
	int array[]=new int[5];
	public static void main(String[] args) {
		System.out.println(classvariable);
		PassByRefArrayDemo pbr =new PassByRefArrayDemo();
		System.out.println(pbr.instancevariable);
		int localvariable=0;
		System.out.println(localvariable);
		for(int i:arr) {
			System.out.println(i+"\t arr \t");
		}
		System.out.println();
		for(int i:pbr.array) {
		System.out.println(i+"\t array \t");}
		System.out.println();
		int local[]=new int [5];
		for(int i:local) {
			System.out.println(i+"\t local \t");
		}
	}
}
