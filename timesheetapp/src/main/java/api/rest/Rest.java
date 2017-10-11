package api.rest;

import api.util.RestUtil;
import com.jayway.restassured.response.Response;

import static api.rest.Methods.postRole;

public class Rest {

    public static Response getAllRole() {
        Response getRoleResponse = Methods.getAllRole();
        RestUtil.verifyExpectedResponseStatusCode(getRoleResponse, 200);
        return getRoleResponse;
    }

    public String getRoleViaRest() throws Exception {
        Response getRoleResponse = getAllRole();
        return RestUtil.getJsonValue(getRoleResponse,"roleName[0]");
    }











    public void createRoleViaRest() throws Exception {
        Response postOneRole = postRole("Automation", "Automation");
        RestUtil.verifyExpectedResponseStatusCode(postOneRole, 201);

    }

}
