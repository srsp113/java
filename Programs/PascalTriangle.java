import java.util.*;
public class PascalTriangle{
	public static int fact(int g){
		int f=1,t=1;
		while(t<=g){
			f=f*t;
			t++;
	}
	return f;
	}
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int j;
		for(int i=0;i<=n;i++){
			for(j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++){
				System.out.print(" "+fact(i)/(fact(j)*fact(i-j)));
			}
			System.out.println();
		}
	}
}