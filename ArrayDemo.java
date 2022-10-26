package array;

public class ArrayDemo {

	public static void main(String[] args) {
		String count[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String tens[]= {"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		String place[]= {"ten","hundred","thosand","tenthousand","hundredth thousand","million","tenth million","hundredth million"};
		String arr1[]=new String[5];
		arr1[0]="william1";
		arr1[1]="william2";
		arr1[2]="william3";
		arr1[3]="william4";
		arr1[4]="william5";
		for(String p:arr1)
		{
		
		System.out.println(p);
		}
		for(String q:count)
		{
		
		System.out.println(q);
		}
		for(String r:place)
		{
		
		System.out.println(r);
		}

	} 
	
	

}
