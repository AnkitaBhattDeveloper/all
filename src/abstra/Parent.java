package abstra;

public class Parent {
	void plot()
	{
		int p= 780000;
		float ki = 50000;
		System.out.println("price of kitchen is " +ki);
    	System.out.println("price of plot is" +p);	
	}
}
class home extends Parent{
    void kitchen(int p,float ki) {
    	super.plot();
    	int pi = p;
    	float k = ki;
    	System.out.println("price of kitchen is " +ki);
    	System.out.println("price of plot is" +p);	
    	
    	
    }

public static void main(String args[])
{
	home h = new home();
	h.kitchen( 12345,5678);
}
}


