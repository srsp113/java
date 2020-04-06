class Bike{
public void start(){
	System.out.println("Bike Strated");
}
public void stop(){
	System.out.println("Bike Stops");
}
}
interface BikeSpec{
	public abstract void horn();
	public abstract void tyres();
	public abstract void engine();
}
class Pulsar extends Bike implements BikeSpec{
	public void horn(){
		System.out.println("Normal Horn- pulsar");
	}
	public void tyres(){
		System.out.println("Tube Less-pulsar");
	}
	public void engine(){
		System.out.println("BS4 Engine pulsar ");
	}
}
class FZ extends Bike implements BikeSpec{
	public void horn(){
		System.out.println("Normal Horn- FZ");
	}
	public void tyres(){
		System.out.println("back tyre Tube Less-FZ");
	}
	public void engine(){
		System.out.println("BS4 Engine FZ ");
	}
}
public class InterfaceEx{
	public static void main(String [] args){
		Pulsar p = new Pulsar();
		p.start();
		p.stop();
		p.horn();
		p.tyres();
		p.engine();
		FZ F = new FZ();
		F.start();
		F.stop();
		F.horn();
		F.tyres();
		F.engine();
	}
}