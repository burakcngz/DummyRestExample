package base;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utils.listeners.Listener;
import utils.listeners.Log;

import static base.RestAssuredBase.spec;
import static config.GeneralConfig.ReadProperty;
import static config.GeneralConfig.getConfigValue;
import static io.restassured.RestAssured.baseURI;

// This is the base class for all tests. All test classes will be inherited from here.
// Setting the baseURI and the specifications for the tests is here.
@Listeners(Listener.class)
public class BaseTest {
    public RequestSpecification specification;
    @BeforeSuite
    public void setup(){
        Log.info("Test Started");
        ReadProperty();
        baseURI = getConfigValue("api.base.uri");
        specification = spec();
    }
    @AfterSuite
    public void tearDown(){
        Log.info("Test Finished");
    }
}
