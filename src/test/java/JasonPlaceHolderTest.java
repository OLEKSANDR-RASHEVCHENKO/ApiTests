import config.TestConfig;
import org.testng.annotations.Test;

import static constants.Constants.ACTIONS.*;
import static io.restassured.RestAssured.*;
public class JasonPlaceHolderTest extends TestConfig {
@Test
    public void get(){
    given().queryParam("postId",1).log().uri().
            when().get(JSON_PLACE_HOLDER_GET).
            then().log().body().statusCode(200);
}
@Test
    public void put(){

    String putBodyJson = "{\n" +
            "\"id\":1,\n" +
            "\"title\":\"foo\",\n" +
            "\"body\":\"bar\",\n" +
            "\"userId\":1,\n" +
            "}";
    given().body(putBodyJson).log().uri().
            when().put(JSON_PLACE_HOLDER_PUT).
            then().log().body().statusCode(200);
}
@Test
    public void delete(){
    given().log().uri().
            when().delete(JSON_PLACE_HOLDER_DELETE).
            then().log().body().statusCode(200);
}
@Test
    public void PostWithJson(){
    String postBodyJson = "{\n" +
            "\"title\":\"foo\",\n" +
            "\"body\":\"bar\",\n" +
            "\"userId\":1\n" +
            "}";
    given().body(postBodyJson).log().all().
            when().post(JSON_PLACE_HOLDER_POST).
            then().spec(requestSpecificationForPost).log().body();
}
@Test
    public void PostWithXml(){
    String postXmlBody = "<Company>\n" +
            "  <Employee>\n" +
            " <FirstName>Tanmay</FirstName>\n" +
            "  <LastName>Patil</LastName>\n" +
            "  <ContactNo>1234567890</ContactNo>\n" +
            "  <Email>tanmaypatil@xyz.com</Email>\n" +
            "  <Address>\n" +
            "   <City>Bangalore</City>\n" +
            "   <State>Karnataka</State>\n" +
            "   <Zip>560212</Zip>\n" +
            "  </Address>\n" +
            "  </Employee>\n" +
            "</Company>";
    given().spec(requestSpecificationXML).body(postXmlBody).log().uri().
            when().post("").
            then().spec(requestSpecificationForGet).log().body();
}
}

