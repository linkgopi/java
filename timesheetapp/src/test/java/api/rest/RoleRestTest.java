package api.rest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoleRestTest {

    @Test
    public void getRoleAPI() throws Exception {
        System.out.println("getRoleAPI()");
        Rest getRestRole = new Rest();
        assertEquals("Developer", getRestRole.getRoleViaRest());
        System.out.println(getRestRole.getRoleViaRest());
    }

    @Test
    public void postRoleAPI() throws Exception {
        System.out.println("postRoleAPI()");
        Rest postRestRole = new Rest();
        postRestRole.createRoleViaRest();
        System.out.println("postRestRole.createRoleViaRest()");
    }

}