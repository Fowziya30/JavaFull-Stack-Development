package activity2;

public class SwapUsingMethod { 
	
	int x,z;
	//call by referce
	void swap(SwapUsingMethod s)
	{
		int a=s.x;
		s.x=s.z;
		s.z=a;
	}
	public static void main(String[] args) {
		SwapUsingMethod obj=new SwapUsingMethod();
		obj.x=90;
		obj.z=78;
		
		//Before swapping 
		System.out.println("before swapping:\n");
		System.out.println("x:"+obj.x);
		System.out.println("z:"+obj.z);
		obj.swap(obj);
		
		//after swapping 
		System.out.println("after swapping:\n");
		System.out.println("x:"+obj.x);
		System.out.println("z:"+obj.z);
		
}

	
		
	}

