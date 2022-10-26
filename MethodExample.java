package Class;

public class MethodExample {

	//method 
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	//another methodd
	//int method is not return the value beacuse using return
	int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodExample obj =new MethodExample();
		obj.sum(20, 23);
		System.out.println(obj.add(20, 49));
		
		

	}

}
