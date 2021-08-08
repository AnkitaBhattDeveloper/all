package read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
JSONParser par = new JSONParser();
Object obj = par.parse(new FileReader("C:\\Users\\Priyanka\\Desktop\\myJson.json"));
JSONObject jsonobject = (JSONObject)obj;
String name = (String)jsonobject.get("name");
System.out.println("Name is :" + name);
String location = (String)jsonobject.get("location");
System.out.println("Location is:"+ location);
long salary = jsonobject.get("salary");
System.out.println("salary is:"+ salary);
JSONArray jrr = (JSONArray)jsonobject.get("course");
Iterator it = jrr.iterator();
while(it.hasNext())
{
	System.out.println("course"+it.next());
	
}


	}

}
