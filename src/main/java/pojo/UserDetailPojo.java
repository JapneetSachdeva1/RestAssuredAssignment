package pojo;

public class UserDetailPojo
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


    private String name;
    private String username;
    private String email;


    AddressPojo addressPojo;


    public AddressPojo getAddressPojo() {
        return addressPojo;
    }


    public void setAddressPojo(AddressPojo addressPojo) {
        this.addressPojo = addressPojo;
    }


    public UserDetailPojo(){}


    public UserDetailPojo(String name, String username, String email, AddressPojo addressPojo)
    {
        this.name = name;
        this.username = username;
        this.email = email;
        this.addressPojo = addressPojo;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}
