package RestAssured;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest8 
{
 
	@Test
	public void getRequest()
	{
		JsonPath jsonpath =RestAssured
		.get("https://restful-booker.herokuapp.com/booking/10")
		.then()
		.extract()
		.jsonPath();
		
		
		System.out.println(jsonpath.get("firstname").toString());
		System.out.println(jsonpath.getString("lastname"));
		
		
	}
	
	
	
	
}
