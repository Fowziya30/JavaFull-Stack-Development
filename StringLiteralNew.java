package datatypleExample;

public class StringLiteralNew {

	public static void main(String[] args) {
		String str="java";//literal method
		String str3="java";
		String str1=new String("java");//new method
		String str2=new String("JAVA");
		if(str==str1)
			//check location also
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		if(str.equals(str1))//str=java,str1=java(both values are same)
			//check value only
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		if(str==str2)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		
		
		
		

	}

}
