public class Grade{
	public static void main(String [] args){
		int marks = 75;
		if(75<=marks&&marks<100){
			System.out.println("Student grade is 1");
		}
		else if(50<=marks&&marks<75){
			System.out.println("Student grade is 2");
		}
		else if(35<=marks&&marks<50){
			System.out.println("Student grade is 3");
		}
		else{
			System.out.println("Student is failed");
		}
	}
}