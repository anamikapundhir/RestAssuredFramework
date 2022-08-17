package getCall;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetCallValidations {

	//http://api.openweathermap.org/data/2.5/weather?q=London&appid=5796e112bb43d657ebbe2bf9e7153cfb
 
	@Test
 	public void validateStatusCode() {
		Response response = get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=5796e112bb43d657ebbe2bf9e7153cfb");
		
		int statusCode = response.statusCode();
		
		System.out.println("Status Code is : " + statusCode);
		Assert.assertEquals(statusCode, 200, "Incorrect status code");
	}
}
