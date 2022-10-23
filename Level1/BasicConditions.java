
class BasicConditions{
	
	public static void main(String[] args){
		/*checkIsEven(2);
		checkIsEven(3);*/
		
		/*checkNumber(1);
		checkNumber(-1);
		checkNumber(0);*/
		checkDay("monday");
		checkDay("xyz");
		checkDay("1");
		
	}
	
	public static void checkIsEven(int number){
		if(number%2 == 0){
			System.out.println("it's a even number");
		}else{
			System.out.println("it's a odd number");
		}
	}
	
	public static void checkNumber(int number){
		
		if(number > 0){
			System.out.println("It is a positive number");
		}else if(number < 0){
			System.out.println("It is a negetive number");
		}else{
			System.out.println("It is a zero");
		}
		
	}
	
	
	public static void checkDay(String day){
		
		day = day.toUpperCase();
		
		switch(day){
			case "MONDAY": 
			case "1":
				System.out.println("It's Monday");
				break;
			case "TUSEDAY":
				System.out.println("It's Tuseday");
				break;
			case "WEDNESDAY":
				System.out.println("It's WEDNESDAY");
				break;
			case "THURSDAY":
				System.out.println("It's THURSDAY");
				break;
			case "FRIDAY":
				System.out.println("It's FRIDAY");
				break;
			case "SATURDAY":
				System.out.println("It's SATURDAY");
				break;
			case "SUNDAY":
				System.out.println("It's SUNDAY");
				break;
			default:
				System.out.println("Invalid input");
		}
	}
	
}