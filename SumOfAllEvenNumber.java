package Activity4;
import java.util.Scanner;

public class SumOfAllEvenNumber {

	public static void main(String[] args) {
		 int n, sum = 0;
	        
	        System.out.println("Enter a number");
	        
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        
	        //Sum of all even numbers between 1 to n
	        
	        for(int i = 2; i <= n; i++) {
	            
	            /*If number is divisible by 2, 
	             *then it's a even number
	             */       
	            if(i % 2 == 0) {
	                sum += i;
	            }
	        }
	        
	        System.out.println("The sum of all even numbers between 1 to " + n + " is " + sum);

     
}
}

