package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\kozi_repos\\programming\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String urlAddress = "https://spicejet.com/";

        driver.get(urlAddress);
        System.out.println("TEST");
        Select s = new Select(((ChromeDriver) driver).findElementById("ctl00_mainContent_DropDownListCurrency"));
        s.selectByIndex(1);
//        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
        ((ChromeDriver) driver).findElementById("ctl00_mainContent_ddl_originStation1_CTXT").click();
//        ((ChromeDriver) driver).findElementByXPath("//a[@value='GOI']").click();
        driver.findElement(By.cssSelector("a[value='VGA']")).click();
        driver.close();
        driver.quit();

//        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
//


    }
}
