package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
        }
    }

    @Test
    public void loginSuccess(){


       app.getHelperUser().openLoginForm();
       app.getHelperUser().fillLoginForm("artem.komissarov.1999@gmail.com","Arte@Kom0607");
       app.getHelperUser().submitLogin();

       // Assert if element with text "Logget in success is present"
        Assert.assertEquals(app.getHelperUser().getMessage(),"Logged in success");
        app.getHelperUser().clickOKButton();






    }


    @Test
    public void loginSuccessModel(){


        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("artem.komissarov.1999@gmail.com","Arte@Kom0607");
        app.getHelperUser().submitLogin();

        // Assert if element with text "Logget in success is present"
        Assert.assertEquals(app.getHelperUser().getMessage(),"Logged in success");
       // app.getHelperUser().clickOKButton();






    }


    @Test
    public void loginWrongEmail(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("artem.komissarov.1999gmail.com","Arte@Kom0607");
        app.getHelperUser().submitLogin();
        Assert.assertEquals(app.getHelperUser().getErrorText(),"It'snot look like email");
        Assert.assertTrue(app.getHelperUser().isYallaButtonNotActive());



    }

    @Test
    public void loginWrongPassword(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("artem.komissarov.1999@gmail.com","Arte0607");
        app.getHelperUser().submitLogin();


    }


    @Test
    public  void loginUnregisteredUser(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("komisarov.1999@gmail.com","Ae@Kom0607");
        app.getHelperUser().submitLogin();

    }






    @AfterMethod

    public void postCondition(){
        app.getHelperUser().clickOKButton();


    }


}
