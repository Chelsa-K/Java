package superkeyword;

public class Cat extends AnimalSuper
{
	String color = " yellow";
	
	public Cat (String friend)
	{
		super("labbb");
		System.out.println(friend);
		
	}
	public void name()
	{
		super.name();
		super.age();
		
		
		System.out.println("Naughty");
		System.out.println(color);
		System.out.println(super.color);
	}
	
	
	public static void main(String[] args)
	{
		Cat obj = new Cat("Cat's friend");
		obj.name();
		Cat c = new Cat("lab");
		
		
	}
	
	

}
