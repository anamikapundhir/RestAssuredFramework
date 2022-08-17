package postCall;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostCallValidations {

	@Test
	public void test_post() {

		JSONObject json = new JSONObject();

		json.put("name", "anamika");
		json.put("job", "tester");
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(json.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().all();

	}
	
	@Test
	public void test_put() {

		JSONObject json = new JSONObject();

		json.put("name", "anamika");
		json.put("job", "tester");
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(json.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();

	}
	
	@Test
	public void test_patch() {

		JSONObject json = new JSONObject();

		json.put("name", "anamika");
		json.put("job", "tester");
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(json.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();

	}
	
	@Test
	public void test_delete() {

		given().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();

	}
}
