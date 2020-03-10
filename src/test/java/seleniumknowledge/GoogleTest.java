package seleniumknowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class GoogleTest {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='gbw']//*[@class='gb_g']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sign in")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        String mainWindow=driver.getWindowHandle();
        //driver.switchTo().window(mainWindow);
        // It returns no. of windows opened by WebDriver and will return Set of Strings
        Set<String> set =driver.getWindowHandles();
        // Using Iterator to iterate with in windows
            for (String handle:set) {
                driver.switchTo().window(handle);
            }
        driver.findElement(By.id("identifierId")).sendKeys("ramana.5117@gmail.com");
        driver.findElement(By.xpath("//span[@class = 'RveJvd snByac']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("nyoS7c UzCXuf EIlDfe")).sendKeys("ramana.5117@gmail.com");




       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
        //element.sendKeys("yourPassword");

//Now click on sign in button
       // driver.findElement(By.id("signIn")).click();//next page

        //driver.findElement(By.xpath("//a[@class='h-c-header__nav-li-link ']")).click();

            /*try{

            EL.click();+
            System.out.println("Gmail button");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Printed message");
            driver.close();
        }*/
      // driver.close();

    }
}
