package Class;
class Lamp
	{
		//Store the values of light
		//true if light is ON
		//False if light is off
		//feild
		boolean isON;
		//method of turnon
		void turnON()
		{
			isON=true;
			System.out.println("LightON?:"+isON);
		}
		//method to turnoff
		void turnOff()
		{
			isON=false;
			System.out.println("LightON?:"+isON);
		}
	}
public class ClassExample {
				public static void main (String[] args) {
					//creating object
					Lamp led=new Lamp();
					Lamp led1=new Lamp();
					//turn on the light by calling turn on the method
					led.turnON();
					led1.turnOff();

				}

		
	}


