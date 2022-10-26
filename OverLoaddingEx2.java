package OopsConcept;

public class OverLoaddingEx2 {
	public void square()
	{
		System.out.println("No parameter");
	}
	public void square(int num)
	{
		int square=num*num;
		System.out.println("Method with integer Argument"+square);
	}
	public void square(double num)
	{
		double square=num*num;
		System.out.println("Method with integer Argument"+square);
	}
	public static void main(String[] args) {
		OverLoaddingEx2 obj=new OverLoaddingEx2();
		obj.square();
		obj.square(3);
		obj.square(7.1);
		
		

	}

}
