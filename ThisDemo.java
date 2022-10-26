package constructor;
//this..keyword represent the class,,means euse object of a class within the class itself
//use to resolve the name collision 
//use to make constructor stacking
public class ThisDemo {
	String name;//instance variable
	ThisDemo(String name)
	{
		this.name=name;
	}
void display()
{
	System.out.println("Name is"+name);
}
	public static void main(String[] args) {
		ThisDemo obj=new ThisDemo("ziya");
		obj.display();
		

	}

}
