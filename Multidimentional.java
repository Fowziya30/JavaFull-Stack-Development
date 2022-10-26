package array;

public class Multidimentional {

	public static void main(String[] args) {
		int [][]mynum= {{1,2,3,4},{5,6,7,8}};
		//2 loop using in multi dimensional array 
		//i and j
		for(int i=0;i<mynum.length;i++)
		{
			for(int j=0;j<mynum[i].length;j++)
				
			{
				System.out.print(mynum[i][j]);	
				
				}
			System.out.println();
		}
		
	}

}
