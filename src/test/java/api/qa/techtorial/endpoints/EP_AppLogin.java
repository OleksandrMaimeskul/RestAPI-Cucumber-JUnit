package api.qa.techtorial.endpoints;

import api.qa.techtorial.pojo.PJ_AppLogin;
import api.qa.techtorial.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class EP_AppLogin {

    public void validateLoginEndPoint(String email, String password, String expectedMessage) {
        RestAssured.baseURI = ConfigReader.readProperty("base_url");
        RestAssured.basePath = ConfigReader.readProperty("app_login");

        Response response = RestAssured.given().contentType("application/json").accept("application/json").
                body(STR."{\n    \"email\":\"\{email}\",\n    \"password\":\{password}\n}")
                .when().post().then()
                .log().body().extract().response();
        PJ_AppLogin pjAppLogin = response.as(PJ_AppLogin.class);
        Assert.assertEquals(expectedMessage, pjAppLogin.getMessage());
    }
}
