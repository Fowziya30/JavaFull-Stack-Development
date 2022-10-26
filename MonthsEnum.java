package variable;

public enum MonthsEnum {
	//public enum Month
	
		JANUARY(0),FEBRUARY(1),MARCH(2),APRIL(3),MAY(4),JUNE(5),JULY(6),AUGUST(7),SEPTEMBER(8),OCTOBER(9),NOVEMBER(10),DECEMBER(11);
	private int MonthsEnumIndex;
	MonthsEnum(int name)
	{
		this.MonthsEnumIndex=name;
	}

	public static void main(String[] args) {
		
		//print only index number
		System.out.println(MonthsEnum.JUNE.getMonthsEnumIndex());
		System.out.println(MonthsEnum.NOVEMBER.getMonthsEnumIndex());
		
	//print Month  name only	
System.out.println(MonthsEnum.JUNE);
System.out.println(MonthsEnum.NOVEMBER);
	}
	// 
public int getMonthsEnumIndex()
{
	return MonthsEnumIndex;
	}
	

}


