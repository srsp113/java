import java.util.*;
public class StrOccurence{
	public static void main(String[] args){
		Scanner h =new Scanner(System.in);
		System.out.println("Enter the String");
		String s= h.nextLine();
		int len =s.length();
		int i,j;
		char array[] = new char[len];
		for(i=0;i<len;i++){
			array[i]=s.charAt(i);
			int p=0;
			for(j=0;j<len;j++){
				if(array[i]==s.charAt(j)){
					p++;
				}
			}
			System.out.println(array[i]+""+p);
		}
	}
}