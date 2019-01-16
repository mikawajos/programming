package config.helpers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static com.codeborne.selenide.Selenide.$;

public class PageActions {

//    private static ProjectConfig projectConfig = AppContextHelper.getApplicationContext().getBean(ProjectConfig.class);

    public static void clickAndSetValue(SelenideElement element, String value) {
        element.click();
        element.setValue(value);
    }

/*    public static void acceptAlert() {
        try {
            switchTo().alert.accept();
        } catch (NoAlertPresentException e) {
            //nthg here
        }
    }

    public static void closeAlertsInAllWIndows() {
        Set<String> availableWindows = getWebDriver().getWindowHandles();
        for (String windowId : availableWindows) {
            SeleniumWrapper.switchToNewWindowByItsTitle(windowId);
            acceptAlert();
        }
    }*/

    public static void selectAllCheckboxes(ElementsCollection elements) {
        for (SelenideElement el : elements) {
            el.click();
        }
    }

    public static SelenideElement getFollowingTdElementFor(String text) {
        String xPath = "//td[contains(text(),'" + text + "')]/following-sibling::td";
        return $(By.xpath(xPath));
    }

    public static SelenideElement getSecondFollowingTdElementFor(String text) {
        String xPath = "//td[contains(text(),'" + text + "')]/following-sibling::td/following-sibling::td";
        return $(By.xpath(xPath));
    }

/*    public static SelenideElement getRadioButtonBy(String name, String value) {
        return $("input['name='" + name + "'][value'" + value + "']'"]");
    }*/

    public static String getEstSystemTime(String format) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/NEw_York"));
        return getEstSystemTime(format);
    }

    public static Date getTImePreviousWorkingDay() {
        final Calendar cal = Calendar.getInstance();
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
            cal.add(Calendar.DATE, -3);
        } else {
            cal.add(Calendar.DATE, -1);
        }
        return cal.getTime();
    }

    public static void threadSleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
    }

/*    public static void checkRadioButtonAvailability(SelenideElement element) {
        element.click();
        element.waitUntil(checked, seleniumConfig.getShortTimeout());
    }*/

}
