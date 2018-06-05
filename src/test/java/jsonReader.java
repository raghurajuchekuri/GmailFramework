
import java.io.File;
import java.util.List;
import java.util.Random;
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
		 System.out.println("Car:"+car);
		 
		 System.out.println("Food Items:");
		 JSONArray favorite_foods = Objectone.getJSONArray("favorite_foods");
		 List<Object> foods = favorite_foods.toList();
		 for (Object food : foods) {
		     System.out.print((String)food+" ");
		 }
		 System.out.println();
		 
		}
		
			
			
		System.out.println("**********Random Data Generation**********");
		System.out.println("FirstName : " +jsonReader.generateRandomFirstName()+  "\nLastName : "+jsonReader.generateRandomLastName());
		System.out.println("Phone No : " +generateRandomPhoneNumber());
		
	}
	
	 public static String generateRandomFirstName() {
	        String[] firstNames = {"JAMES", "JOHN", "ROBERT", "MICHAEL", "WILLIAM", "DAVID", "RICHARD", "CHARLES",
	                "JOSEPH", "THOMAS", "CHRISTOPHER"};
	        return firstNames[new Random().nextInt(firstNames.length)];
	    }

	    /**
	     * Generates a random last name
	     *
	     * @return random last name
	     */
	    public static String generateRandomLastName() {
	        String[] lastNames = {"SMITH", "JOHNSON", "BROWN", "JONES", "MILLER", "GARCIA", "RODRIGUEZ", "ANDERSON",
	                "TAYLOR", "THOMAS", "MOORE"};
	        return lastNames[new Random().nextInt(lastNames.length)];
	    }
	    
	    
	    public static String generateRandomPhoneNumber() {
	        int length = 10;
	        char[] digits = new char[length];
	        Random rand = new Random();
	        for (int i = 0; i < length; i++) {
	            digits[i] = (char) ('0' + rand.nextInt(10));
	        }
	        // phone number cannot be started with '0' or '1'
	        if (digits[0] == '0' || digits[0] == '1') {
	            digits[0] = '2';
	        }
	        return new String(digits);
	    }	    
	        
	}
