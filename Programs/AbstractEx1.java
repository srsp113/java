abstract class School{
	public void blackboard(){
		System.out.println("Class has a blackboard");
	}
	public void benches(){
		System.out.println("Class has a benches also");
	}
}
abstract class Classes extends School{
	public void ClassTeacher(){
		System.out.println("Every class has  teacher");
	}
	public abstract void ClassNo();
	public abstract void TeacherName();
	public abstract void TotalStudents();
}
class Standard extends Classes{
	public void ClassNo(){
		System.out.println("Standard is 7");
	}
	public void TeacherName(){
		System.out.println("Teacher name is Srinu");
	}
	public void TotalStudents(){
		System.out.println("total Students are 45");
	}
}
class Standard8 extends Classes{
	public void ClassNo(){
		System.out.println("Standard is 8");
	}
	public void TeacherName(){
		System.out.println("Teacher name is Dev");
	}
	public void TotalStudents(){
		System.out.println("total Students are 25");
	}
}
public class AbstractEx1{
	public static void main(String [] args){
		Standard s = new Standard();
		s.ClassNo();
		s.TeacherName();
		s.TotalStudents();
		//Standard8 p = new Classes(); gives CTE --> Classes is abstract; cannot be instantiated
		Standard8 p = new Standard8();
		p.ClassNo();
		p.TeacherName();
		p.TotalStudents();
	}
}