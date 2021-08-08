package jav;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.util.Iterator;
import java.util.Scanner;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Bhk {
	private static HttpURLConnection connection;
	public static void main(String[] args) throws IOException, ParseException {
		
		String line=" ";
		StringBuffer responseContent = new StringBuffer();
		System.out.println("enter the location" );
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		URL url = new URL("http://api.weatherapi.com/v1/current.json?key=f2708286ade9454ea8381614210808&q="+str+"&aqi=no");
		connection = (HttpURLConnection)url.openConnection();
		InputStreamReader isr = new InputStreamReader(connection.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		//StringBuilder builder = new StringBuilder();
		
	   int status = connection.getResponseCode();
		
		System.out.println(status);
		while((line = br.readLine())!= null)
		{
			responseContent.append(line);
		}
		br.close();
		System.out.println(responseContent.toString());
	
	
	//JSONParser par = new JSONParser();
	
		//Object obj = par.parse(new FileReader(responseContent.toString()));
		//String key = "42917cab93094f7fa9b61017210408";
		//JSONObject jsonobject = new JSONObject();
		/*String response = (String)jsonobject.get("connection");
		System.out.println("connection is" + response);
		String name = (String)jsonobject.get("name");
		System.out.println("Name is :" + key);
		String region = (String)jsonobject.get("region");
		System.out.println("region is:"+ key);
		JSONArray jrr = (JSONArray)jsonobject.get("location");
		Iterator it = jrr.iterator();
		while(it.hasNext())
		System.out.println("location"+it.next());*/
		
			
		}

	}


