package API_RestAssured;



import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Rest_first {

	public static void main(String[] args) {		
		  
			// Specify the base URL to the RESTful web service
			RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 
			// Get the RequestSpecification of the request that you want to sent
			// to the server. The server is specified by the BaseURI that we have
			// specified in the above step.
			RequestSpecification httpRequest = RestAssured.given();
	 
			// Make a request to the server by specifying the method Type and the method URL.
			// This will return the Response from the server. Store the response in a variable.
			Response response = httpRequest.request(Method.GET, "/Hyderabad");
	 
			// Now let us print the body of the message to see what response
			// we have recieved from the server
			String responseBody = response.getBody().asString();
			System.out.println("Response Body is =>  " + responseBody);
			
			//Validating Response Body
			System.out.println("*************Response Validation*****************");
			ResponseBody body = response.getBody();
			String bodyAsString = body.asString();			
			Assert.assertEquals(bodyAsString.toLowerCase().contains("hyderabad") /*Expected value*/, true /*Actual Value*/);
			System.out.println("Response body contains Hyderabad");
			
			int statusCode = response.getStatusCode();
			assertEquals(statusCode, 200);
			System.out.println("Response Code is : " + statusCode );
	 
	}

}
