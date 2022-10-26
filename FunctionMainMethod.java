package OopsConcept;


public class FunctionMainMethod {
	void main()//nothing return
	{
		System.out.println("void main");
		
	}
	int main(int a,int b)
	{
		System.out.println("int Main");
		return a+b;
	}
	String main( String a,String b)
	{
		System.out.println("String  Main");
		return a.concat(b);
	}
	Float main( Float a,Float b,Float c)
	{
		System.out.println("Float Main");
		return a*b*c;
	}
	
	
	
	public static void main(String[] args) {
		
	
	FunctionMainMethod obj=new FunctionMainMethod();
	obj.main();
	System.out.println(obj.main(10,12));
	System.out.println(obj.main("HI","MAM"));
	System.out.println(obj.main(1.2f,2.3f,4.5f));
}
}
