package week;

public class PassByValueAndPassByReference {
	public static void main(String[] args) {
		laddu obj=new laddu();
           obj.setsize(10);
           System.out.println("initally the size of laddu is :"+ obj.getsize());
          pbv obj1=new pbv();
          obj1.modifiedSizeOfLuddu(obj. size);
          System.out.println("now the size is"+obj.getsize());
          pbr obj2=new pbr();
          obj2. modifiedSizeOfLuddu(obj);
          System.out.println("pass by reference laddu"+obj.getsize());
	}
}
class pbv{
	public void modifiedSizeOfLuddu(int size) {
		size=size-5;
	}
} 
class pbr{
	public void  modifiedSizeOfLuddu(laddu laddu) {
		laddu.setsize(5);
	}
}
class laddu{
	int size;
	public void setsize(int size) {
		this.size=size;
	}
	public int getsize() {
		return this.size;
	}
}
