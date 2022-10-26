package constructor;

public class ThisEx {
	//initializing var
	int x =5;
	static int y=10;//automatically call
	//default constructor
	ThisEx()
	{
		//invoking current class constructor
		this(5);//the value inside the constaructor
		System.out.println("We are inside the default constructor");
		System.out.println("The value of x=:"+x);
		
	}
	ThisEx(int x)
	{
		this.x=x;//override value of the current class instance variable
		System.out.println("We are inside the default constructor");
		System.out.println("The value of x=:"+x);
		
	}

	public static void main(String[] args) {
		new ThisEx();//didnt create any object
		System.out.println("We are inside the main");
		
		

	}

}
