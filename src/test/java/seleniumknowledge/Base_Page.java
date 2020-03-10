/*
package seleniumknowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base_Page {

    private static String currentUsersDir = System.getProperty("user.dir");

    public static WebDriver driver;

    public static void waitUpTo(int seconds) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static Properties loader_properties() throws IOException {

        File file = new File("objects.properties");
        InputStream fileInput = null;

        fileInput = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInput);

        return prop;

    }

    public static void systemOutPrint(String message) {

        System.out.println(message);
    }

   */
/* public static void openThroughFireFoxBrowser() {

        System.setProperty("webdriver.gecko.driver", currentUsersDir
                + "\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();

    }*//*


    public static void openThroughChromeBrowser() {

        System.setProperty("webdriver.chrome.driver", currentUsersDir
                + "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static Actions getAction() {
        Actions action = new Actions(driver);
        return action;
    }

    public static WebElement selectElement(String locatorType,
                                           String locatorValue) {

        WebElement webElement = null;

        switch () {
            case "id":
                webElement = driver.findElement(By.id(locatorValue));
                break;
            case "className":
                webElement = driver.findElement(By.className(locatorValue));
                break;
            case "linkText":
                webElement = driver.findElement(By.linkText(locatorValue));
                break;
            case "xpath":
                webElement = driver.findElement(By.xpath(locatorValue));
                break;
            case "cssSelector":
                webElement = driver.findElement(By.cssSelector(locatorValue));
                break;
            case "tagName ":
                webElement = driver.findElement(By.tagName(locatorValue));
                break;
        }
        return webElement;
    }

    public static Select dropDownSelection(WebElement webElement,
                                           int dropDownType, Object dropDownIndex) {

        Select select = new Select(webElement);

        switch (dropDownType) {
            case 1:
                System.out.println("case 1");
                select.selectByVisibleText((String) dropDownIndex);
                break;
            case 2:
                System.out.println("case 2");
                select.selectByValue((String) dropDownIndex);
                break;
            */
/*
             * case 3: System.out.println("case 3"); select.selectByIndex((int)
             * dropDownIndex); break;
             *//*

        }
        return select;
    }
}
*/
