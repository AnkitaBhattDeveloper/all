package abstra;

 abstract class Abstract {

	 void vehicle()
	 {
	System.out.println("heyy i'm the method of class anotherabstract");	 
	 }
	 abstract void car();

}
 class Abs extends Abstract{
	 void car() {
		 System.out.println("hey another abstract");
	 }
 }
  class Anotherabstract {
	 public static void main(String args[]) {
		 Abstract ob = new Abstract()
				 {
			 void car() { 
			 }
				 };
				 ob.vehicle();
	Abs obj = new Abs();
	obj.car();
	 }
 }
