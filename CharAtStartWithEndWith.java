package datatypleExample;

public class CharAtStartWithEndWith {

	public static void main(String[] args) {
		String s ="ZIYA";
		//CharAt
				System.out.println(s.charAt(3));
				
	  //Startwith
				System.out.println(s.startsWith("ZI"));
	
				//EndsWith
				System.out.println(s.endsWith("YA"));
				System.out.println(s.toCharArray());
				//empty
				String a="";
				a.isEmpty();
				//a.isBlank();
				System.out.println(a);

}
}