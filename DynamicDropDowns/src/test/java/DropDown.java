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
//        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
//


    }
}
