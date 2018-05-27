
import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;


public class jsonReader {

	public static void main(String[] args) throws Exception {

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
		 System.out.println("Cars Null Value:"+car);
		 
		 JSONArray favorite_foods = Objectone.getJSONArray("favorite_foods");
		 List<Object> foods = favorite_foods.toList();
		 for (Object food : foods) {
		     System.out.println((String)food);
		 }
		 System.out.println();
		 
		}
		
			
			
        
	}
}
