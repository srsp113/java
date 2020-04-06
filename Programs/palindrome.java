public class palindrome{
	public static void main(String [] args){
		int a=1234;
		int b,c=0,d;
		d=a;
		while(a>0){
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		if(d==c)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}

