package api.qa.techtorial.stepdefenitions;

import api.qa.techtorial.endpoints.EP_Appinformation;
import io.cucumber.java.en.Then;

public class SD_Appinformation {
    EP_Appinformation epAppinformation = new EP_Appinformation();

    @Then("User validates {string}, {string},{string}, and {string} from App response Payload")
    public void user_validates_and_from_app_response_payload(String message, String companyName, String companyEmail, String companyWebsite) {
        epAppinformation.validateAppInformation(message, companyName, companyEmail, companyWebsite);
    }

}
