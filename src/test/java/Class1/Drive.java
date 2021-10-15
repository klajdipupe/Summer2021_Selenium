package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drive {
    public static void main(String[] args) {

        //path of the driver (chrome)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }
}
 