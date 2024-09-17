package api.qa.techtorial.endpoints;

import api.qa.techtorial.pojo.PJ_AppInformation;
import api.qa.techtorial.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class EP_Appinformation {
    public void validateAppInformation(String expected_message, String companyName, String companyEmail, String website) {
        RestAssured.baseURI = ConfigReader.readProperty("base_url");
        RestAssured.basePath = ConfigReader.readProperty("app_information");

        Response response = RestAssured.given().accept("application/json").when().get().then()
                .statusCode(200).log().body().extract().response();
        PJ_AppInformation deserializeResponse = response.as(PJ_AppInformation.class);
        Assert.assertEquals(expected_message, deserializeResponse.getMessage());
        Assert.assertEquals(companyName, deserializeResponse.getData().getCompany_name());
        Assert.assertEquals(companyEmail, deserializeResponse.getData().getCompany_email());
        Assert.assertEquals(website, deserializeResponse.getData().getWebsite());
    }
}
