package datatypleExample;
import java.util.Arrays;


public class ToChar {

	public static void main(String[] args) {
		String s="Ziya";
		char[]dest=new char[2];
		s.getChars(0,2,dest,0);
		System.out.println(Arrays.toString(dest));
	}

}
