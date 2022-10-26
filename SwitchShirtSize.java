package conttrolstatement;

public class SwitchShirtSize {

	public static void main(String[] args) {
		int number=44;
		String size;
		//switch statement to check size
		switch(number)
		{
		case 29:
			size="small";
			break;
		case 42:
			size="Medium";
			break;
			//match the value here
		case 44:
			size="Large";
			break;
		case 48:
			size="Extra Large";
			break;
		default:
			size="unknown";
			break;
		}
		System.out.println("size:"+size);

	}

}
