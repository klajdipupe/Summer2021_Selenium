package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkClass {

@Test
    public void enterUsername(){

    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");
    WebDriver driver = new ChromeDriver();
    driver.get("https://wwww.facebook.com");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    String emailAddress = "email";
    By emailLocator = By.name(emailAddress);

    /**
     * TO find a WebElement
     * method: findElement()
     * input: locator (by datatype)
     * output:
     *    if the element is found, WebElement will be returned
     *    else No suchElement exception

     */

    /**
     * To type in a WebElement
     * method: sendKeys()
     * input: String (data that we want to type in WeElement)
     */

    /**
     * To click on a WebElement
     * method:click()
     *
     */

    WebElement emailBox = driver.findElement(emailLocator);
    emailBox.sendKeys("abcd@test.com");
}
@Test
public void isElementEnabled(){
    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");
    WebDriver driver = new ChromeDriver();
    driver.get("https://wwww.facebook.com");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    /** To verify if a webElement is displayed or not
     * method: isDisplayed()
     * return type: boolean
     */


    String loginName = "login";
    By loginButtonLocator = By.name(loginName);
    WebElement loginButton = driver.findElement(loginButtonLocator);
    boolean isLoginDisplayed = loginButton.isDisplayed();   // exp: true
    Assert.assertTrue(isLoginDisplayed,"Login button is not displayed");


    /**
     * To verify if the WebElement is Selected or not
     * method: isSelected()
     * return type: boolean
     */

    }

}
