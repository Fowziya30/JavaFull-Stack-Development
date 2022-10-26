package OopsConcept;

public class MatrixAddition {

	
		public static void main(String[] args) {
			int arr1[][]= {
					{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}
			};
			int arr2[][]= {
					{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}
			};
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(arr1[i][j]+arr2[i][j]+"\t");
				}
				System.out.println();
			}

			}


	}

