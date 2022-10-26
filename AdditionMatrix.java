package OopsConcept;

public class AdditionMatrix {

	public static void main(String[] args) {
		int sum1=0;
		int arr1[][]= {
				{1,2,3,10},
				{9,5,10,10},
				{15,10,8,9},
				{10,10,11,12}
		};
		
		for(int i=0;i<4;i++) 		
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr1[i][j]+"\t");
				}
			System.out.println();
		}
		
		
				for(int i=0;i<4;i++) 
				{
					for(int j=0;j<4;j++)
					{
								if(i==j)
				
										{
									//System.out.println(i +" "+ j+" "+arr1[i][j]);
										sum1 = sum1 + arr1[i][j];
											}
				     }
				 
				}
				
				     System.out.println("SUMLof feft  DIAGONAL elements of the matrix = "+sum1) ;
				
				     int sum2=0;
				     for(int i=0;i<4;i++)
				     {
							for(int j=0;j<4;j++)
							{
								if(arr1.length==(i+j)+1)
						
								{
								//System.out.println(arr1.length+" "+(i+j)+1);
									sum2= sum2 + arr1[i][j];
								}
						     }
						 }
						 
				     
						     System.out.println("\nSUM of Right  DIAGONAL elements of the matrix = "+sum2) ;
				 } 
			
			
			
		
	

	}


