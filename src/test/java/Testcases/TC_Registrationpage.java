package Testcases;

import org.testng.annotations.Test;
import Baseclass.createbaseclass;
import Notarypages.Registrationpage;


 

   public class TC_Registrationpage extends createbaseclass {

    

    @Test(priority=1)
     public void test1() {

        createtestcases tc1=new createtestcases();
        tc1.testcases();

         }

    

    @Test(priority=2)
    public void test2() {

    	Registrationpage rp=new Registrationpage(driver);

        rp.Personalinformation("Ramireddy","Maramreddy","maramreddy9676@gmail.com","9392566427");

    }

    @Test(priority=3)
    public void test3() {

        Registrationpage rp=new Registrationpage(driver);
        
        rp.Billingaddress("TCS","Bendcircle","Tulasinagar","Markapur","Andhrapradesh","23","India");

    }

    

    @Test(priority=4)
    public void test4() {

        Registrationpage rp=new Registrationpage(driver);

        rp.Additionalrequiredinformation("9676238196");

    }

    

    @Test(priority=5)
    public void test5(){

        Registrationpage rp=new Registrationpage(driver);

        rp.Accountsecurity("viswaram@999", "viswaram@999");
        
    }

        

        

        

    

    

 

}