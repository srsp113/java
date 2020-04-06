import java.util.*;
public class AlphaNumeric{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String p = s.nextLine();
		int sum=0;
		for(int i=0;i<p.length();i++){
			if(Character.isDigit(p.charAt(i))){
				sum=sum+Integer.parseInt(p.charAt(i)+"");
			}
		}
		System.out.println(sum);
	}
}