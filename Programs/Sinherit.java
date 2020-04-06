//single inheritance example
class Organization{
String Company ="Achyutas";
}
class EmployeeDetails extends Organization{
String Ename ="Pradeep";
int Eid = 0245;
}
public class Sinherit{
public static void main(String [] args){
EmployeeDetails d = new EmployeeDetails();
System.out.println(d.Company+" "+d.Ename+" "+d.Eid);
}
}