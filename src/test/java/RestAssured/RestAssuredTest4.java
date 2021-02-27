package RestAssured;

import static io.restassured.RestAssured.*;

import org.apache.http.StatusLine;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.google.inject.matcher.Matcher;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest4 
{
 
	@Test
	public void getRequest()
	{
		RestAssured
		.get("https://restful-booker.herokuapp.com/booking/1")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("firstname", Matchers.equalTo("Mark"))
		.body("bookingdates.checkin",Matchers.equalTo("2015-09-24"));
		
	}
	
}
