package test;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kslisenko on 5/4/14.
 */
public class WebDriverTest {

    @Test
    public void testYandex() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://yandex.ru");
        WebElement search = driver.findElement(By.id("text"));
        search.sendKeys("selenium");
        search.submit();
        driver.close();
    }
}
