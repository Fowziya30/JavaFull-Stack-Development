package datatypleExample;

//import java.lang.reflect.Array;

import java.util.Arrays;

public class GetChar {

	public static void main(String[] args) {
		
		  String s1="Fowziya Sheerin";
		 char[]dest=new char[9];
		  s1.getChars(0,9,dest,0);//(from where,last index)
		  System.out.println(Arrays.toString(dest));
		 
		  		
			}

	}

