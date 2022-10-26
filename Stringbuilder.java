package datatypleExample;

public class Stringbuilder {

	public static void main(String[] args) {
		//stringBuilder is used to change the string
				StringBuilder str1=new StringBuilder("Fow");
				
				//append using add the string 
				str1.append("ziya");
				System.out.println(str1);
				
				//reverse
				//str1.reverse();
				//System.out.println(str1);
				
				//Insert(start with 0)
				
				str1.insert(7, "sheerin");
				System.out.println(str1);
				
				//Replace
				str1.replace(7, 14, "Mahamuth");
				System.out.println(str1);
				
				//delete
				
				str1.delete(7, 15);
				System.out.println(str1);
				
				

	}

}
