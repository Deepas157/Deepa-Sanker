package weekpart2;

public class PassByRefArray {
	public static void main(String[] args) {
		int arr[]=new int [5];
		for (int i:arr) {
			System.out.println(i+"\t  array brfore modification...");
		}
		AcceptArray array=new AcceptArray();
		array.modifyarray(arr);
		for(int i:arr) {
		System.out.println(i+"\t after modification");
	}}
}
class AcceptArray{
	public void modifyarray(int a[]) {
		a[2]=300;
	}
}
