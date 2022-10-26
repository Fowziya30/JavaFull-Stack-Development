package OopsConcept;

public class HCFEx {
	int HCF(int a,int b)
	{
		if(a==b)
		{
			return a;
		}
		else if(a==0)
		{
			return b;
		}
		else if(b==0)
		{
			return a;
		}
		else if(a>b)
		{
			return HCF(a%b,b);//
			
		}
		else
		{
			return HCF(a,b%a);
			
		}
	}

	public static void main(String[] args) {
		HCFEx obj =new HCFEx();
		obj.HCF(24,12);
		System.out.println("HCF oftwo nummbers:"+obj.HCF(24,12));
		
	}

}
