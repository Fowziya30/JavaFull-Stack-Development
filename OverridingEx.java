package OopsConcept;
/*
 * if a subclass/Child class has the same method with same name and same signature as declared in the parent
 *  class is known as method overriding in java
 */

class Human
{
	
//overridden method--any method in the parent(HUMAN) class that method is called overridden,
	//and the parent method is used in child class(GIRLS)called overriding.
	//a method declare in the child class but is already preasent in the parent class is knon as overriden
public void eat()
{
	System.out.println("Human is eating!");
}
}
class Girls extends Human
{
	//overriding method
	public void eat()
	
	{
		System.out.println("Girl is eating!");
	}
}
public class OverridingEx {

	public static void main(String[] args) {
		Girls obj=new Girls();
		obj.eat();
		Human obj2=new Human();
		obj2.eat();
	}

}


