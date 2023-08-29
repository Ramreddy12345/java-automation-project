package Notarypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

import Baseclass.createbaseclass;

 public class Registrationpage extends createbaseclass{

    

    public Registrationpage(WebDriver driver) {

        PageFactory.initElements(driver, this);

          }

    

    //@FindBy (xpath="//*[@id=\"mynavbar\"]/div/a[2]")
    //WebElement signupbutton;

    

    //Personal information

    @FindBy (name="firstname")
    WebElement firstname;
    @FindBy (id="inputLastName")
    WebElement lastname;
    @FindBy (name="email")
    WebElement email;
    @FindBy (id="inputPhone")
    WebElement phonenumber;

    //Billing address

    @FindBy (id="inputCompanyName")
    WebElement companyname;
    @FindBy (name="address1")
    WebElement address1;
    @FindBy (id="inputAddress2")
    WebElement address2;
    @FindBy (name="city")
    WebElement cityname;
    @FindBy (id="stateinput")
    WebElement statename;
    @FindBy (id="inputPostcode")
    WebElement postcode;
    @FindBy (id="inputCountry")
    WebElement countryname;

    //Additional Required information

    @FindBy (id="customfield2")
    WebElement whatsupnumber;

    //Account security

    @FindBy (name="password")
    WebElement password;
    @FindBy (id="inputNewPassword2")
    WebElement confirmpassword;

    

     public void Personalinformation(String first,String last,String mail,String phone) {

        //signupbutton.click();
        firstname.sendKeys(first);
        lastname.sendKeys(last);
        email.sendKeys(mail);
        phonenumber.sendKeys(phone);

         }

    
     public void Billingaddress(String company,String Address1,String Address2,String city,String state,String post,String country) {

        companyname.sendKeys(company);
        address1.sendKeys(Address1);
        address2.sendKeys(Address2);
        cityname.sendKeys(city);
        statename.sendKeys(state);
        postcode.sendKeys(post);
        countryname.sendKeys(country);

    }

     public void Additionalrequiredinformation(String number) {

        whatsupnumber.sendKeys(number);

    }

    public void Accountsecurity(String securitykey,String confirmsecuritykey) {

        password.sendKeys(securitykey);
        confirmpassword.sendKeys(confirmsecuritykey);

    }

    

 

        

        

    

            

            

            

            

            

}

        