package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import static config.GeneralConfig.getConfigValue;

public class RestAssuredBase {
    public static RequestSpecBuilder requestSpecBuilder;


    public static RequestSpecification spec(){

        requestSpecBuilder = new RequestSpecBuilder();

        if(getConfigValue("request.logging").equalsIgnoreCase("true"))
            requestSpecBuilder.addFilter(new RequestLoggingFilter());

        if(getConfigValue("response.logging").equalsIgnoreCase("true"))
            requestSpecBuilder.addFilter(new ResponseLoggingFilter());

        requestSpecBuilder.addHeader("content-type","application/json");
        return requestSpecBuilder.build();
    }
}
