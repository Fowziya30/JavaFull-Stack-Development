package OopsConcept;

public class OverLoadingDivision {

	void Division (int a,long b)
	{
	System.out.println("A/B="+(a/b));
	}
	void Division(int a,int b,int c)
	{
	System.out.println("A/B+C="+(a/b+c));
	}
	public static void main(String[] args) {
		OverLoadingDivision obj=new OverLoadingDivision();
	obj.Division(50,34);
	obj.Division(56,34,22);
		

	}

}
