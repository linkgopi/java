package api.rest;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import static com.jayway.restassured.RestAssured.given;

public class Methods {

    private static RequestSpecification getHeaders() {

        return  given()
                .relaxedHTTPSValidation()
                .contentType("application/json")
                .when();
    }

    public static Response getAllRole() {
        return getHeaders().get("https://shielded-harbor-21142.herokuapp.com/roles/all");
    }

    public static Response postRole(String description, String name ) {

        String myJson = "{\"roleDescription\":\"" + description + "\", " + "\"roleName\":\"" + name + "\"}";
        return given()
                .contentType("application/json")
                .body(myJson)
                .when()
                .post("https://shielded-harbor-21142.herokuapp.com/roles/create");
    }
}
