package pojo;

public class AddressPojo
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


    private String street;
    private String suite;
    private String city;
    private String zipCode;


    GeoPojo geoPojo;


    public GeoPojo getGeoPojo() {
        return geoPojo;
    }


    public void setGeoPojo(GeoPojo geoPojo) {
        this.geoPojo = geoPojo;
    }


    public AddressPojo(){}


    public AddressPojo(String street, String suite, String city, String zipCode, GeoPojo geoPojo)
    {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipCode = zipCode;
        this.geoPojo = geoPojo;
    }


    public String getStreet() {
        return street;
    }


    public void setStreet(String street) {
        this.street = street;
    }


    public String getSuite() {
        return suite;
    }


    public void setSuite(String suite) {
        this.suite = suite;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getZipCode() {
        return zipCode;
    }


    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
