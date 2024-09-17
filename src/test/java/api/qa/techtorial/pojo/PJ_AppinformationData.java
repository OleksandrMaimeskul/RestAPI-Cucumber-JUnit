package api.qa.techtorial.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)

public class PJ_AppinformationData {
    private String company_name;
    private String company_email;
    private String website;
}
