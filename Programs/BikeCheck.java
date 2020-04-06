class Bike{
public void start(){
System.out.println("Bike is Starting");
}
public void brake(){
System.out.println("applied a break");
}
public void stop(){
System.out.println("Bike is Stopped");
System.out.println("Bike is Stopped");
System.out.println("Bike is Stopped");
}
}
class Unicorn extends Bike{
public void start(){
System.out.println("unicorn is Starting");
}
public void brake(){
System.out.println(" unicorn applied a break");
}
public void stop(){
System.out.println("unicorn Bike is Stopped");
System.out.println("unicorn Bike is Stopped");
}
}
class Pulsar extends Unicorn{
public void start(){
System.out.println("pulsar Bike is Starting");
}
public void brake(){
System.out.println("pulsar applied a break");
}
public void stop(){
System.out.println("pulsar Bike is Stopped");
}
}
public class BikeCheck{
public static void main(String [] args){
Bike b = new Bike();
Unicorn u = new Unicorn();
Pulsar p = new Pulsar();
Bike l = new Unicorn();
Unicorn h = new Pulsar();
Bike g = new Pulsar();
b.start();
b.brake();
b.stop();
u.start();
u.brake();
u.stop();
p.start();
p.brake();
p.stop();
l.start();
l.brake();
l.stop();
h.start();
h.brake();
h.stop();
g.start();
g.brake();
g.stop();


}
}

