package RestAssured;

import static io.restassured.RestAssured.*;

import org.apache.http.StatusLine;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.google.inject.matcher.Matcher;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest5 
{
 
	@Test
	public void getRequest()
	{
		Response response= RestAssured.get("https://restful-booker.herokuapp.com/booking/1");
		
		String fname=response.jsonPath().get("firstname").toString();
		System.out.println(fname);
		String lname=response.jsonPath().getString("lastname");
		System.out.println(lname);
		
		Object obj=response.jsonPath().get("firstname");
		System.out.println((obj  instanceof String));
		
		if(obj instanceof String)
		{
			System.out.println(obj.toString());
		}
		
		else if(obj instanceof Integer) 
		{
			System.out.println(((Integer) obj).getInteger("totalprice"));
			
			
		}
		 
		
	}
	
}
