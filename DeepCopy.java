package clone;

public class DeepCopy {

	public static void main(String[] args) {
		int array[]= {1,2,3,4};
		//deep copy
		int clonearray[]=array.clone();//created deep copy
		
		
		
		System.out.println(array==clonearray);//== check the value only
		//in array you print the statement using for loop
		for(int i=0;i<4;i++) {
			
		
		System.out.println(clonearray[i]);
		}
		for(int i=0;i<4;i++) {
			
			
			System.out.println(array[i]);
		}

	}

}
