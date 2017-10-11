package api.util;

import com.jayway.restassured.response.Response;
import static org.junit.Assert.assertEquals;


public class RestUtil {

    public static void verifyExpectedResponseStatusCode(Response r, int statusCode) {
        if (r.getStatusCode() != statusCode) {
            //r.peek();
            assertEquals(statusCode, r.getStatusCode());
        }
    }

    public static String getJsonValue(Response r, String enterJsonObject) {
        return r.getBody().jsonPath().getJsonObject(enterJsonObject);
    }

    public static String returnResponseValueStringAsEmptyOrActualValue(Response r, String valueToRetrieve) {
        if (r.getBody().jsonPath().getJsonObject(valueToRetrieve) != null) {
            return r.getBody().jsonPath().getJsonObject(valueToRetrieve).toString();
        }
        return "";
    }
}

