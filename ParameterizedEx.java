package constructor;

public class ParameterizedEx {
	String Districts;
//constructor will accept single 
	ParameterizedEx(String Dist)
	{
		Districts=Dist;
		System.out.println(Dist+"Distric");
	}
	public static void main(String[] args) {
		//call constructor by passingString value
		
		ParameterizedEx obj1= new ParameterizedEx("Erode");
		ParameterizedEx obj2= new ParameterizedEx("Chennai");
		ParameterizedEx obj3= new ParameterizedEx("Thiruvannamalai");
	    ParameterizedEx obj4= new ParameterizedEx("Kanchipuram");
		
	}

}
