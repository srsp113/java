class Loading{
void add(){
System.out.println("add empty method 1");
}
void add(String j){
System.out.println("add empty method 2");
}
void add(int i){
System.out.println("add with one argument "+i);
}
}
public class MethodLoading{
public static void main(String [] args){
Loading l = new Loading();
l.add();
l.add(45);
}
}