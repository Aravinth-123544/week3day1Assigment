package week3day1;

public class Overloading {

	public void add(int x,int y) {
		System.out.println(x+y);
	}
		
	
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);

}
	public void multiple(double x,double y) {
		System.out.println(x*y);
	}
	public void multiple(float x, float y ) {
		System.out.println(x*y);
		
	}
	public static void main(String[] args) {
		Overloading loading=new Overloading();
		loading.add(10, 20);
		loading.add(10, 20, 30);
		loading.multiple(10, 50);
		loading.multiple(90.0, 100.0);
		
		
	}
	}
