package datatypleExample;

public class Stringexample {

	public static void main(String[] args) {
		//string literal
		String value="Fowziya";
		System.out.println(value);
		String value1=" Doing";
		System.out.println(value1);
		
		//second method to declare string
		String value2=new String(" Java Course");
		System.out.println(value2);
		String value3=new String(" in EduBridge");
		System.out.println(value3);
		String value4="Fowziya";
		
		//adding to string 1.method (direct adding)
		System.out.println(value+value1+value2+value3);
		
		//2.method(concadinate)
		String str=value.concat(value1);
		System.out.println(str);
		String str1=value1.concat(value2);
		System.out.println(str1);
		
		//length
		int length=value.length();
		System.out.println(length);
		
		//compare(==,equals)
		boolean result=value.equals(value1);
		System.out.println(result);
		boolean result1=value.equals(value4);
		System.out.println(result1);
		
		//toUpperCase
		System.out.println(value.toUpperCase());
		
		//toLowerCase
		System.out.println(value3.toLowerCase());
		//if case
		if(value==value2)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not same");
			
		}
		if(value==value4)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not same");
		}
			

	}

}
