package constructor;
//super is the reserved keyword used to call base class method or variable
class Animal
{
	String color="grey";
}
class Cat extends Animal
{
	Cat()
	{
		//data members of the cat class
		String color="Brown";
		System.out.println("The cat is of color:"+super.color);//invoking the parent class method
		System.out.println("The cat is of color:"+color);
		
	}
}

//create child class for cat

public class SuperEx extends Cat {
	//default constructor
	SuperEx()
	{
		super();
		System.out.println("the eyes of cat is blue:");
	}
	public static void main(String[] args) {
		//call default constructor of the superEx
	new SuperEx();
	System.out.println("Inside the main method");

	}

}
