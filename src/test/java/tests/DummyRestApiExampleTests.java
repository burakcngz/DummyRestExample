package tests;

import base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.RestAssuredBase.spec;


public class DummyRestApiExampleTests extends BaseTest {

    @Test
    public void getEmployeeTest(){
        // Sending Request
        JsonPath response = RestAssured
                .given()
                .spec(specification)
                .get("/employees")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .jsonPath();

        // Assert the total number of records
        Assert.assertEquals(response.getList("data").size(),24);
        // Assert the employee name where employee salary is 313500
        Assert.assertEquals(response.getString("data.find {it.employee_salary==313500}.employee_name"),"Haley Kennedy");

    }
}