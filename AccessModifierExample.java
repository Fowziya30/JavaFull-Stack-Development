package Class;
class ParentClass{
int a = 10;
///public
public int b = 20,e=10,f=45;//access
//protected
protected int c = 30;//access
//public
private int d = 40;//not accesable

void showData() {
System.out.println("Inside ParentClass");
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
}

}
class ChildClass extends ParentClass{
	
	
void accessData() {
System.out.println("Inside ChildClass");
System.out.println("a = " +a);
System.out.println("b = " + b);
System.out.println("c = " + c);
//System.out.println("d = " + d);// private member can't be accessed

ChildClass cc=new ChildClass();
cc.showData();

System.out.println("e = " +e);
}
}
class ChildClass1 extends ChildClass{
void accessData1() {
	
	System.out.println("Inside ChildClass1");
	System.out.println("a = " +a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("f = " + f);
}
}

public class AccessModifierExample {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.showData();
		obj.accessData();
		ChildClass1 cc1 = new ChildClass1();
		cc1.accessData1();
		
	}

}
