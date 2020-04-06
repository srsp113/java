import java.util.*;
public class ConcatStr{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String p = s.nextLine();
		System.out.println("Enter the another String");
		String r = s.nextLine();
		String q=p+" "+r;
		System.out.println("Concated String is  "+q);
	}
}