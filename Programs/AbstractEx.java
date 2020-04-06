abstract class Car{
public void start(){
	System.out.println("car Started");
}
public void stop(){
	System.out.println("Car Stopped");
}
abstract void horn();
abstract void steering();
}
class Porshe extends Car{
	void horn(){
		System.out.println("Porsche horn");
	}
	void steering(){
		System.out.println("Porsche Power Steering");
	}
}
class Benz extends Car{
	void horn(){
		System.out.println("Benz horn");
	}
	void steering(){
		System.out.println("Benz Power Steering");
	}
}
class Nano extends Car{
	void horn(){
		System.out.println("Nano horn");
	}
	void steering(){
		System.out.println("Nano Normal Steering");
	}
}
public class AbstractEx{
	public static void main(String [] agrs){
		//CarFactory d = new CarFactory();
		//String a = d.getCar("Porshe");
		//System.out.println(a);
		//Car c = new CarFactory().getCar("Porshe");
		//Car c = a;
		Nano c= new Nano();
		c.start();
		c.stop();
		c.horn();
		c.steering();
	}
}
/*class CarFactory{
	String getCar(String Car){
		if(Car.equals("Porshe"))
		return "new Porshe()";
		else if( Car.equals("Benz"))
		return "new Benz()";
		else if(Car.equals("Nano"))
		return "new Nano()";
	 }
}*/