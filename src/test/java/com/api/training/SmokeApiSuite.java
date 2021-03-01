package com.api.training;

import Services.ApiServices;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SmokeApiSuite {
    ApiServices apiServices=new ApiServices();

    @Test
    public void wireMockFirstMockAPI(){
    Response response = apiServices.getRequest("http://localhost:8087/some/thing");
    response.then().statusCode(200);
    }

}
