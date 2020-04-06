import java.util.*;
public class ReverseString{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String p = s.nextLine();
		String r ="";
		for(int i=p.length()-1;i>=0;i--){
			r=r+p.charAt(i);
		}
		System.out.println(r);
	}
}