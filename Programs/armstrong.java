public class armstrong{
	public static void main(String [] args){
		int a=153;
		int b, c=0,d;
		d=a;
		while(a>0){
			int b=a%10;
			c=(c)+(b*b*b);
			a=a/10;
		}
		if(d==c)
			System.out.println("armstrong");
		else
			System.out.println("Not armstrong");
	}
}