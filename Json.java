package hii;


import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

public class Json {

	
		
	public static void main(String[] args) throws IOException {
		 
		
		System.out.println("enter the location" );
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://api.weatherapi.com/v1/current.json?key=42917cab93094f7fa9b61017210408&q="+str+"&aqi=no")).build();
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		.thenApply(HttpResponse::body)
		.thenAccept(System.out::println)
		.join();

	
		
	
	}


		


