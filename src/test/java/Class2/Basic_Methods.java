package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic_Methods {

    // TC: Verify page title

    //Test Methods

    @Test
    public void verifyPageTitle() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");

        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";
        driver.get(url);

        String pageTitle = driver.getTitle();
        System.out.println("page title --> " + pageTitle);
        String exPageTitle = "Facebook - Get connected with Friends";

        Assert.assertEquals(pageTitle, exPageTitle, "Page title is not as expected");

        driver.quit();
    }


    @Test
    public void verifyUrl(){
       System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");
       WebDriver driver = new ChromeDriver();

       String url = "https://www.facebook.com/";
       driver.get(url);

       String actualUrl = driver.getCurrentUrl();

       Assert.assertEquals(url, actualUrl, "Page url is not as expected");

       driver.quit();
    }


  @Test
  public void verifyAbcd(){

      System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");

      WebDriver driver = new ChromeDriver();

      String url = "https://www.facebook.com/";
      driver.get(url);

      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

       driver.get("https://www.amazon.com");

      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      driver.navigate().back();

      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      driver.navigate().forward();

      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      driver.quit();
  }

  @Test
    public void refreshWebPage() {

      System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");

      WebDriver driver = new ChromeDriver();

      String url = "https://www.facebook.com/";
      driver.get(url);

      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

  }
}