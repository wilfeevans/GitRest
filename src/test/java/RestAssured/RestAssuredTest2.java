package RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest2 
{
 
	@Test
	public void getRequest()
	{
		Response response=RestAssured.get("https://restful-booker.herokuapp.com/booking/10");
		//String str=response.asString();
		String str=response.body().jsonPath().getString("firstname");
		System.out.println(str);
		
		
		
	}
	
	
	
	
}
