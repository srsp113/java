interface BikeSpec{
	public abstract void horn();
	public abstract void tyres();
	public abstract void engine();
	//public abstract void cc(){}--gives error because interface doesnot contain concrete classes
}
class Pulsar implements BikeSpec{
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
class FZ implements BikeSpec{
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
public class InterfaceEx1{
	public static void main(String [] args){
		Pulsar p = new Pulsar();
		p.horn();
		p.tyres();
		p.engine();
		FZ F = new FZ();
		F.horn();
		F.tyres();
		F.engine();
	}
}