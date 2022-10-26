package Class;

public class AnotherExampleForClass {

	//declaring class variables
	public String name;
	public long population;
	
	//defining the method of the class
	public void display()
	{
	System.out.println("City name: " +name);
	System.out.println("Population: " +population);
	}
	//main
	public static void main(String[] args) {
		
			//declaring the objects of the class City
		AnotherExampleForClass metro1,metro2,metro3;
		
		
			//Instantiating the objects of the class using the new keyword
			metro1 = new AnotherExampleForClass();
			metro2 = new AnotherExampleForClass();
			metro3 = new AnotherExampleForClass();
			metro1.name ="Chennai";
			metro1.population = 78409876;
			System.out.println("Details of metro city 1:");
			metro1.display(); //display() method is being invoked for the object metro1
			metro2.name ="Delhi";
			metro2.population = 54874194;
			System.out.println("Details of metro city 2:");
			metro3.name ="Banglore";
			metro3.population = 5874194;
			System.out.println("Details of metro city 3:");
			metro3.display(); //display() method is being invoked for the object metro3

	}

}
