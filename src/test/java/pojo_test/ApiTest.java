package pojo_test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojo.AddressPojo;
import pojo.GeoPojo;
import pojo.UserDetailPojo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest
{

    /*
{
"name": "Leanne Graham",
"username": "Bret",
"email": "Sincere@april.biz",
"address": {
"street": "Kulas Light",
"suite": "Apt. 556",
"city": "Gwenborough",
"zipcode": "92998-3874",
"geo": {
"lat": "-37.3159",
"lng": "81.1496"
}
}
}
*/
    @BeforeClass
    public void setup()
    {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL);

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder()
                .expectStatusCode(201)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL);

        RestAssured.requestSpecification = requestSpecBuilder.build();
        RestAssured.responseSpecification = responseSpecBuilder.build();
    }

    @Test
    public void test()
    {

        GeoPojo geoPojo = new GeoPojo("-37.3159", "81.1496");
        AddressPojo addressPojo = new AddressPojo("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", geoPojo);
        UserDetailPojo userDetailPojo = new UserDetailPojo("Leanne Graham", "Bret", "Sincere@april.biz", addressPojo);

        given()
                .body(userDetailPojo)
                .when()
                .post("/users")
                .then()
                .body("id", equalTo(11));
    }
}
