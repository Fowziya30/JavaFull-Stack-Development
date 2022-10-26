package array;

public class Singledimensionarray {

	public static void main(String[] args) {
		//declare array
		int array[]= {200,300,550,800,950};//1st way
		 String name[]= {"Fowzi","Gayu","lalitha","shamsheera","monika"};
		 int []array1=new int[5];//2nd way
		 array1[0]=200;
		 array1[1]=300;
		 array1[2]=550;
		 array1[3]=8000;
		 array1[4]=950;
		//in array before printing using for loop
		  for(int i=0;i<array1.length;i++)
//i(starting),i<5 (length of the array,i++ increment
		  {
			  System.out.println(array[i]);
			  System.out.println(array1[i]);
			  
		  }
		  for(int i=0;i<5;i++)
		  {
			  System.out.println(name[i]);
			}
		  
		

	}

}
