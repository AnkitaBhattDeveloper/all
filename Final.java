package joon;

 final class Exam {
	void factor()
	{
		int i,j;
		for (i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		
	System.out.println("");
	}
	}
}
 
 class Mid{
	void student(String name,int id) {
		String n = "anki";
		 int i = 23;
		System.out.println("topper of the school is "+ name);
		System.out.println("id of topper is "+ id);
	}
}
class pre extends Mid {
	void child(String name,int id) {
		super.student("aleena",10);
	int i=id;
	String n = name;
	System.out.println("student name is "+ n);
	System.out.println("student id is "+ id);
	}
}
public  class Final{
	public static void main (String args[]) {
		pre obj = new pre();
		Exam fi = new Exam();
		obj.child("akshay", 3);
		fi.factor();
	
	}
}



		
	
	