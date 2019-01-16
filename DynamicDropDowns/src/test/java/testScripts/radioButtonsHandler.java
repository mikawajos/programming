package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonsHandler {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://echoecho.com/htmlforms10.htm");
        String NAMEIS = "Tutorial";
        driver.getPageSource().contains(NAMEIS);
        driver.manage().window().maximize();
        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

        for (int i = 0; i < count; i++) {
            driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
        }
    }
}
