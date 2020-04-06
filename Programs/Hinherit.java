//hierachial inheritance example
class School{
String S_Name ="Priyadarsini";
}
class EssayWriting extends School{
String name ="Pradeep";
}
class Debate extends School{
String name ="Aditya";
}
class Drawing extends School{
String Name ="rajesh";
}

public class Hinherit{
public static void main(String [] args){
EssayWriting e = new EssayWriting();
System.out.println("Student name is"+e.name+"from "+e.S_Name);
Debate d = new Debate();
System.out.println("Student name is"+d.name+"from" +d.S_Name);
Drawing f = new Drawing();
System.out.println("Student name is"+f.Name+"from "+f.S_Name);
}
}