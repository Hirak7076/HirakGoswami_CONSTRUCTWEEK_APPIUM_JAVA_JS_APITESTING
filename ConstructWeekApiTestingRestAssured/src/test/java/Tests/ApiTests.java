package Tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class ApiTests {
	
	@Test
	public void ScheduleHook(){
		
		given().post("https://posthook-api.mock.beeceptor.com/v1/hooks").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void GetHooks() {
		
		given().get("https://posthook-api.mock.beeceptor.com/v1/hooks").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void GetHookID() {
		
		given().get("https://posthook-api.mock.beeceptor.com/v1/hooks/8e3aa909-fb84-4495-944d-a4c192defe66").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void DeleteHook() {
		
		given().delete("https://posthook-api.mock.beeceptor.com/v1/hooks/8e3aa909-fb84-4495-944d-a4c192defe66").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void PUTHookID() {
		
		given().contentType(ContentType.JSON).queryParam("name","updated-project").queryParam("domain","api.example.com").queryParam("headerAuthorization","").queryParam("minRetries",1).queryParam("retryDelaySecs",5).when().put("https://posthook-api.mock.beeceptor.com/v1/projects/").then().statusCode(200).log().all();
		
	}
	
	
}
