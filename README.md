# RestAssuredAssignment
Rest Assured API Automation Assignment

Question: Create a POJO Class for below Response and Request Payload. Once created we need to create a test for validating the response: 
1) Status Code
2) id
3) name
4) lng (i.e: longitude)

Note: I have created the solution and it can be viewed if you find any issues or refer it once completed. 

You can share your solution with me on LinkedIn here: 
Once shared I'll share a cheatSheet for AI Prompt Engineering!

This Repository uses: 

1) RestAssured
2) Java
3) TestNG
4) Jackson DataBind
5) POJO for Implementing and using custom API Request/Responses

JSON Request Payload:     {
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

JSON Response Payload: 

{
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "addressPojo": {
        "street": "Kulas Light",
        "suite": "Apt. 556",
        "city": "Gwenborough",
        "zipCode": "92998-3874",
        "geoPojo": {
            "latitude": "-37.3159",
            "longitude": "81.1496"
        }
    },
    "id": 11
}
