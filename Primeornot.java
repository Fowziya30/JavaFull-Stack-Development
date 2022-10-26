package activity1;

public class Primeornot {

	public static void main(String[] args) {
		int number=20;
		//int is the data type
		//number  is the variable name
		//10 is the value
		boolean prime=true;//true means prime,,false means its not a prime
		//boolean is the data type
		//prime is the variable name
		//true is the value
		//1st its assume number is prime
		for (int i=2; i<number; i++)
			//in for loop check 1 2 3 4 5 6 7 8 9 10
			                  //start from 2.............end with less than number
			//example "10" is the number start with 2.....end with 9
		{                        
		if(number%i==0)
			//example 10%2=0(not a prime )false
		{
			prime=false;
			break;
		}
	}
		System.out.println(prime);
}
}