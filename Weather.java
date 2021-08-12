package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class Weather {
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.out.println("enter the location you want to search");
		Scanner sca = new Scanner(System.in);
		String loc = sca.nextLine();
		//System.out.println("enter the location" );
		var client = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder(
	URI.create("http://api.weatherapi.com/v1/current.json?key=f2708286ade9454ea8381614210808 &q"+loc+"&aqi=no"))
	.build();
	var response = client.send(request,HttpResponse.BodyHandlers.ofString());
	System.out.println(response.body());
	
String s1 = response.body();
JSONObject json =   new JSONObject(s1)).getJSONObject("location");
String name = json.getString("name");
String region = json.getString("region");
String country = json.getString("country");

JSONObject json1 =  new JSONObject(s1).getJSONObject("current");

 float tempc = json1.getFloat("temp_c");
 float tempf = json1.getFloat("temp_f");
int day = json1.getInt("is_day");

}
}
}
