package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {

        click(By.xpath("//a[text()=' Log in ']"));
    }


    public void fillLoginForm(String email, String password) {

      type(By.id("email"),email);
      type(By.id("password"),password);

    }


    public void submitLogin() {

        click(By.xpath("//button[@type='submit']"));

    }

    public String getMessage() {
       /* WebElement element = wd.findElement(By.cssSelector(".dialog-container>h2"));
          String text =  element.getText();
*/
        //  pause(2000);
        //  return text;

       // WebElement element = wd.findElement(By.cssSelector(".dialog-container>h2"));
        //  String text =  element.getText();
        // return text;
       return wd.findElement(By.cssSelector(".dialog-container>h2")).getText();

        //WebElement element = wd.findElement(By.cssSelector(".dialog-container>h2"));
        //  String text =  element.getText();
        // return text;
        //public String getMessage() {
          //  WebElement element = wd.findElement(By.cssSelector(".dialog-container>h2"));
          //  String text =  element.getText();
           // return text;


    }

    public void clickOKButton() {
        click(By.xpath("//button[text()='Ok']"));

    }
}
