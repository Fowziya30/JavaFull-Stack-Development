package conttrolstatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int total=80;
		if(total>90)
		{
			System.out.println("A+");
		}
		else if(total>=80)
		{
			System.out.println("A");

		}
		else if(total>=70)
		{
			System.out.println("B+");

		}
		else if(total>50)
		{
			System.out.println("FAIL");

		}
	}

}
