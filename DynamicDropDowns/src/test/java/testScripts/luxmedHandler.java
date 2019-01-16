package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class luxmedHandler {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\kozi_repos\\programming\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String urlAddress = "https://luxmed.pl/";

        driver.get(urlAddress);
        System.out.println("TEST");
//        ((ChromeDriver) driver).findElementByCssSelector(".vbtn.gaPatientPortalTop").click();
        ((ChromeDriver) driver).findElement(By.linkText("ZALOGUJ")).click();

        WebElement wholeBodyText = ((ChromeDriver) driver).findElementByTagName("body");

        if (wholeBodyText.getText().contains("ZALOGUJgegegeg")) {
            System.out.println("FOUND IT!!!");
        } else {
            System.out.println("NOT FOUND!!!");
        }

        Assert.assertTrue(wholeBodyText.getText().contains("Masz kontosss?"));
        driver.close();
        driver.quit();


        //        driver.findElement(By.ById(".id")).sendKeys("TATATATTATA");




//        Select s = new Select(((ChromeDriver) driver).findElementById("ctl00_mainContent_DropDownListCurrency"));
//        s.selectByIndex(1);
        driver.close();
        driver.quit();

//        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
//

    }
}
