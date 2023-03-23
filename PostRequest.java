import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given();
		//attach the payload
		JSONObject js = new JSONObject();
		js.put("name", "Abi");
		js.put("job", "qa");
		requestSpecification.body(js.toJSONString());
		Response response = requestSpecification.request(Method.PUT,"api/users/2");
		System.out.println(response.getBody().asPrettyString());
		
		System.out.println(response.getStatusCode());
		
		
		
		
		
	
	}

}
