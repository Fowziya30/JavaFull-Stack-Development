package array;

public class ForEachMethod {

	public static void main(String[] args) {
		int arr[]= {20,30,45,23};
		int total=0;
		//for each method
		
		for(int i:arr)
		{
			total=total+i;
		}
System.out.println("Total of array:"+total);
	}

}
