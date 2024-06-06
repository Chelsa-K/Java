package interfacepackage;

import inheritance.Sample1;

public class Sample2 implements Sample1{
	
	public void print()
	{
		System.out.println("print");
	}
	public void show()
	{
		System.out.println("show");
	}

	public static void main(String[] args) {
		Sample1 obj = new Sample2();
		obj.show();
		obj.print();
		
		// TODO Auto-generated method stub

	}

}
