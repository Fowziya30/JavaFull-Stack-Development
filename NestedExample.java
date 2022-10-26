package conttrolstatement;

public class NestedExample {

	public static void main(String[] args) {
		
			//declaring var
			double n1=-1.0,n2=4.5,n3=-5.3,largest;
			if(n1>=n2)
				
			{
				if(n1>=n3)
				{
					largest=n1;
				}
				else
				{
					largest=n3;
			    }
				
		  }
			else
			{
				if(n2>=n3)
		         {
					largest=n2;
				}
				else
				{
					largest=n3;
		        }
	       }


			
				System.out.println("largest number is:"+largest);
		
			}
		}
