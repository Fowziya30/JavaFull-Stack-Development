package OopsConcept;

public class EX19 {

	
		void Addition(int a,long b)
		{
		System.out.println("A+B="+(a+b));
		}
		void Addition(int a,int b,int c)
		{
		System.out.println("A+B+C="+(a+b+c));
		}
		public static void main(String[] args) {
		EX19 obj=new EX19();
		obj.Addition(50,50);
		obj.Addition(56,34,22);

	}

}
