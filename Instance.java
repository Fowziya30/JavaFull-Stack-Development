package variable;
 class SubjectMarks
 {
	//field(instance variable)
	 String name;
	int English;
	int Maths;
	int Gk;	
}
public class Instance {

	public static void main(String[] args) {
		//Creat an object 
		SubjectMarks stud1=new SubjectMarks();
		stud1.name="Fowziya";
		stud1.English=90;
		stud1.Maths=80;
		stud1.Gk=60;
		SubjectMarks stud2=new SubjectMarks();
		stud2.name="Subi";
		stud2.English=90;
		stud2.Maths=80;
		stud2.Gk=60;
		SubjectMarks stud3=new SubjectMarks();
		stud3.name="Ayisha";
		stud3.English=90;
		stud3.Maths=80;
		stud3.Gk=60;
		//display the value
		System.out.println(stud1.name);
		System.out.println("English:"+stud1.English);
		System.out.println("Maths"+stud1.Maths);
		System.out.println("Gk:"+stud1.Gk);
		System.out.println(stud2.name);
		System.out.println("English:"+stud2.English);
		System.out.println("Maths"+stud2.Maths);
		System.out.println("Gk:"+stud2.Gk);
		System.out.println(stud3.name);
		System.out.println("English:"+stud3.English);
		System.out.println("Maths"+stud3.Maths);
		System.out.println("Gk:"+stud3.Gk);
		
		
		

	}

}
