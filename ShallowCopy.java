package clone;

public class ShallowCopy {

	public static void main(String[] args) {
		int Array1[][]= {{1,2,3,4,5,},{6,7,8,9,19}};
		int cloneArray1[][]=Array1.clone();
		//shallow copy created(Duplicate value for multi dimentional array)
		//print the data
		System.out.println(Array1[0]==cloneArray1[0]);
		System.out.println(Array1[1]==cloneArray1[1]);
		
		
		// this for loop for array
		for(int i=0;i<Array1.length;i++)
			
		{
			for(int j=0;j<Array1[i].length;j++)
				
			{
				System.out.print(Array1[i][j]);

		}
			System.out.println();
		}
		
		//this for loop for clone array
	for(int i=0;i<cloneArray1.length;i++)
			
		{
			for(int j=0;j<cloneArray1[i].length;j++)
				
			{
				System.out.print(cloneArray1[i][j]);

		}
			System.out.println();


	}


	}
}
