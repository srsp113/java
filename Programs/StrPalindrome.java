import java.util.*;
public class StrPalindrome{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String to check whether palindrome or not");
		String p = s.nextLine();
		String r ="";
		for(int i=p.length()-1;i>=0;i--){
			r=r+p.charAt(i);
		}
		if(p.equals(r)){
		System.out.println(p+" is a Palindrome");
		}
		else{
		System.out.println(p+" is not a Palindrome");
		}
	}
}