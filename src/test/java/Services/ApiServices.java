package Services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiServices {

    public Response getRequest(String endpoints){
       return given().when().contentType("application/json").get(endpoints);
    }

    public Response postRequest(String endpoints, String payload){
       return given().when().contentType(ContentType.JSON).body(payload).post(endpoints);
    }

    public Response deleteRequest(String endpoints, int id){
      return given().when().contentType("application/json").delete(endpoints + id);
    }

    public Response authRequest(String userName, String password){
      return given().when()
              .auth()
              .basic("", "")
              .post("");
    }
}
