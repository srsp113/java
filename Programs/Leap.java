public class Leap{
	public static void main(String [] args){
		int year =2020;
		if(year%4==0||year%400==0){
			System.out.println(year + " is a leap year");
		}
		else
			System.out.println(year + "is a not a leap year");
	}
}
