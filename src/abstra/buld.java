package abstra;



abstract class buld {
public void stone(){
	  System.out.println("rock");
}
public void paint()
{
	  
}
}
class ambuja extends buld{
	public void paint(String pname) {
		System.out.println("the paint you want to add is "+ pname);
	}
}
class Bajaj{
	 public static void main(String args[]) {
		 ambuja aj = new ambuja();
		 aj.stone();
		 aj.paint("black");
		 
		 
	 }
	
}
