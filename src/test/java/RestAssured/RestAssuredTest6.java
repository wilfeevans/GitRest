package RestAssured;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest6 
{
 
	@Test
	public void getRequest()
	{
		String fname=RestAssured
		.get("https://restful-booker.herokuapp.com/booking/10")
		.then()
		.extract()
		.jsonPath()
		.getString("firstname");
		
		System.out.println(fname);
		
		
	}
	
	
	
	
}
