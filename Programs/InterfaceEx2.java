interface Numbers{
	int i=45;
	//protected int j=50;//gives CTE-->modifier not allowed here
	//private int k=79;//gives CTE
}
class Hello implements Numbers{
	public void check(){
		System.out.println(i);
		//i=50; gives CTE --> cannot assign a value to final variable i
		System.out.println(i);
		
	}
}
public class InterfaceEx2{
	public static void main(String [] args){
		Hello h = new Hello();
		h.check();
	}
}