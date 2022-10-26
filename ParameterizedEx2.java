package constructor;

public class ParameterizedEx2 {
 
 int id;
 String name;
 int age;
 //create parameterized constructor
 ParameterizedEx2(int i,String n,int a)
 {
	 
	 id=i;
	 age=a;
	 name=n;
	 
 }
 //method to display the values
 void display()
 {
	 System.out.println(id+""+name+""+age);
 }
 public static void main(String[] args) {
	//create object and passing values
	 ParameterizedEx2 obj1=new ParameterizedEx2(1,"ziya",22);
	 ParameterizedEx2 obj2=new ParameterizedEx2(2,"pavithra",21);
	 ParameterizedEx2 obj3=new ParameterizedEx2(3,"gayathri",23);
	 ParameterizedEx2 obj4=new ParameterizedEx2(4,"subi",22);
	 //calling methof for displaying values of object
	 obj1.display();
	 obj2.display();
	 obj3.display();
	 obj4.display();
	 
	}

}
