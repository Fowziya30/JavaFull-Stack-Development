package Class;
class Data
{
	//declaring private variable
	//access modifier
	private String name;
	

//getter method
public String getName()
{
	return this.name;
}
//setter method
public void setName(String name)
{
	this.name=name;
}}

public class PrivateExample {

	public static void main(String[] args) {
		Data d=new Data();
		//acessing private variable
		//d.name="Ziya";
		//it is not acceasable because it is a private variable
		d.setName("Calling private Variable");
		System.out.println(d.getName());

	}

}
