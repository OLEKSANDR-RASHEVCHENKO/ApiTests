package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.*;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.specification.*;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static constants.Constants.Servers.REQUEST_BIN_URL;
import static constants.Constants.Servers.SWAPI_URL;
import static constants.Constants.runVariable.path;
import static constants.Constants.runVariable.server;

public class TestConfig {
    protected RequestSpecification requestSpecificationForSwapiTest  = new RequestSpecBuilder()
            .setBaseUri(SWAPI_URL)
            .build();
    protected RequestSpecification requestSpecificationXML = new RequestSpecBuilder()
            .addHeader("Content-Type","application/json")
            .addCookie("testCookieXML")
            .setBaseUri(REQUEST_BIN_URL)
            .build();
    protected RequestSpecification requestSpecificationJSON = new RequestSpecBuilder()
            .addHeader("Content-Type","application/json")
            .addCookie("testCookieJSON")
            .build();
    protected ResponseSpecification requestSpecificationForGet = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();
    protected ResponseSpecification requestSpecificationForPost = new ResponseSpecBuilder()
            .expectStatusCode(201)
            .build();
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = server;
        RestAssured.basePath = path;




    }
}
