class Test{
private int Rollno;
private String Name;
private String Mobile;

public void setRollno(int roll){
	this.Rollno=roll;
}
public void setName(String name){
	this.Name = name;
}
public void setMobile(String mobile){
	this.Mobile= mobile;
}
public int getRollno(){
	return this.Rollno;
}
public String getName(){
	return this.Name;
}
public String getMobile(){
	return this.Mobile;
}
}
public class EncapsEx{
	public static void main(String [] args){
		Test e = new Test();
		e.setRollno(0245);
		e.setName("Pradeep");
		e.setMobile("8374834838");
		System.out.println(e.getName()+" roll no is"+e.getRollno()+" his mobile no "+e.getMobile());
	}
}