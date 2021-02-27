package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestAssuredTest1
{
	@Test
	public void getRequest()
	{
		Response response=RestAssured.get("https://restful-booker.herokuapp.com/booking/10");
		String str=response.asString();
		System.out.println(str);
	}
}
