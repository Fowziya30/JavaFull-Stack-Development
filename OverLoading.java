package OopsConcept;

public class OverLoading {
	private static void display(int a)
	//same method private 
	{
		System.out.println("Argument"+a);
	}
	private static void display(int a,int b)//same method but different signature
	{
		System.out.println("Argument"+a+"and"+b);
	}
	private static void display(int a,int b,String c)//same method but different signature
	{
		System.out.println("Argument"+a+"and"+b+"and"+c);
	}
	public static void main(String[] args) {
		display(10);
		display(30,32);
		display(43,40,"Java");
		

	}

}
