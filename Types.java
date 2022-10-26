package variable;

public class Types {
	
	//static variable(oudide the body)
	static int m =20;
	
	void method()

	{
		
		//local variable (inside the method)
		int n=90;
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		//object is create because void method is used
		Types obj=new Types();
		int data=60;
		System.out.println(m);
		System.out.println(data);
		obj.method();

	}

}
