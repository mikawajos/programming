package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookPath {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\kozi_repos\\programming\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String urlAddress = "https://www.facebook.com";

        driver.get(urlAddress);

        driver.findElement(By.cssSelector("#email")).sendKeys("tatattta");
        driver.close();


    }
}
