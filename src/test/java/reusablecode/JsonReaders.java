package reusablecode;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonReaders {	
	
	
	public static List<String> gmailjsondata() throws Throwable
	{
		File file = new File("src\\test\\java\\Testdata\\gmaillogin.json");
	    String content = FileUtils.readFileToString(file, "utf-8");		    
	    JSONObject JsonObject = new JSONObject(content);    
	    
	    List<String> gmailjsondata = Arrays.asList(	JsonObject.getString("loginid"),
	    								JsonObject.getString("password"),	    								
	    								JsonObject.getString("to"),
	    								JsonObject.getString("subj"),
	    								JsonObject.getString("body"),
	    								JsonObject.getString("Invalidpassword")
	    							);	    
	    return gmailjsondata;		
	}	
	
	public static void Addressjsondata() throws Throwable
	{
				File file = new File("src\\test\\java\\Testdata\\Address.json");
			    String content = FileUtils.readFileToString(file, "utf-8");
			    
			    JSONObject tomJsonObject = new JSONObject(content);
			    
				JSONArray addresses = tomJsonObject.getJSONArray("addresses");
				
				for(int i = 0; i < addresses.length(); i++) {
			
				 JSONObject Objectone = addresses.getJSONObject(i);
				 
				 String name = Objectone.getString("name");
				 String birthday = Objectone.getString("birthday");		
				 int age = Objectone.getInt("age");
				 boolean married = Objectone.getBoolean("married");		 
				 String car = Objectone.optString("car");
				 
				 System.out.println("********"+i + " Data {}******");
				 System.out.println(name);
				 System.out.println(birthday);
				 System.out.println(age);
				 System.out.println(married);
				 System.out.println("Car:"+car);
				 
				 System.out.println("Food Items:");
				 JSONArray favorite_foods = Objectone.getJSONArray("favorite_foods");
				 List<Object> foods = favorite_foods.toList();
				 for (Object food : foods) {
				     System.out.print((String)food+" ");
				 }
				 System.out.println();
				 
				}
	}
	

}
