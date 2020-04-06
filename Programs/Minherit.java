//multilevel inheritance example
class Organization{
String Company ="Achyutas";
}
class Department extends Organization{
String Dept="Engineering";
}
class EmployeeDetails extends Department{
String Ename ="Pradeep";
int Eid = 0245;
}

public class Minherit{
public static void main(String [] args){
EmployeeDetails d = new EmployeeDetails();
System.out.println(d.Company+" "+d.Dept+" "+d.Ename+" "+d.Eid);
Department e = new Department();
System.out.println(d.Company+" "+d.Dept+" "+d.Ename+" "+d.Eid);//getting error because we are taking upto department class only
System.out.println(d.Company+" "+d.Dept);
}
}