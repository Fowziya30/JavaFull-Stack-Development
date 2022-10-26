package LoopsEX;
import java.util.Scanner;

public class ForMultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter the starting limit m");
		m=sc.nextInt();
		System.out.println("Enter the end limit n");
		n=sc.nextInt();
		for(j=m;j<=n;j++)
		{
			System.out.println("Table of:"+"/n");
		
			for(i=1;i<=10;i++)
		       //i is the starting value,i<=10(ending value)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}



	}


