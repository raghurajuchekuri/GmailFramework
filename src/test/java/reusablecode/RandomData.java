package reusablecode;

import java.util.Random;

public class RandomData {
	
	
	/*System.out.println("**********Random Data Generation**********");
	System.out.println("FirstName : " +RandomData.generateRandomFirstName()+  "\nLastName : "+RandomData.generateRandomLastName());
	System.out.println("Phone No : " +generateRandomPhoneNumber());*/
	
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
