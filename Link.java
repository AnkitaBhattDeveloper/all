package http;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Link {
	public static void main(String args[]) throws IOException
	{
	JSONObject obj = new JSONObject();
	obj.put("name","saad");
   obj.put("location","london");
	obj.put("salary",50000);
			JSONArray list = new JSONArray();
			list.add("java");
			list.add("jsp");
			list.add("servlet");
			obj.put("course",list);
	FileWriter file = new FileWriter("C:\\Users\\Priyanka\\Desktop\\myJSon.json");
	{
		file.write(obj.toString());
		file.flush();
	}
	System.out.println(obj);
	
	}
	
	}
