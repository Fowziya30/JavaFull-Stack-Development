package constructor;
class Student
{
	String name;
	int age;
	//public constructor
	public Student()//No argument constructor
	{
		name="Fowziya";
		age=22;
		
	}
}

public class NoArgument {

	public static void main(String[] args) {
		Student obj=new Student();
		 System.out.println("Student name is:"+obj.name);
		 System.out.println("Student Age is:"+obj.age);
			}



	}


