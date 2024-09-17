package api.qa.techtorial.stepdefenitions;

import api.qa.techtorial.endpoints.EP_AppLogin;
import api.qa.techtorial.utils.ConfigReader;
import io.cucumber.java.en.Then;

public class SD_AppLogin {
    EP_AppLogin epAppLogin = new EP_AppLogin();

    @Then("User validate the {string} from login end-point response")
    public void user_validate_the_from_login_end_point_response(String message) {
        epAppLogin.validateLoginEndPoint(ConfigReader.readProperty("email"),
                ConfigReader.readProperty("password"), message);

    }
    @Then("User validates {string},{string} and {string} from end point response")
    public void user_validates_and_from_end_point_response(String email, String password, String message) {
        epAppLogin.validateLoginEndPoint(email,password,message);
    }

}
