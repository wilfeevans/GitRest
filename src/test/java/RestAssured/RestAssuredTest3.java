package RestAssured;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest3 
{
 
	@Test
	public void getRequest()
	{
		Response response=RestAssured.get("https://restful-booker.herokuapp.com/booking/10");
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(200, statuscode);
		int statuscodes=response.statusCode();
		System.out.println(statuscodes);
		Assert.assertEquals(200, statuscodes);
		String str =response.getStatusLine();
		System.out.println(str);
		Assert.assertEquals(str, "HTTP/1.1 200 OK");
				
		
		
		
	}
	
	
	
	
}
