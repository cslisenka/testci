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
    public void testGoogle() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://google.com");
        WebElement search = driver.findElement(By.id("gbqfq"));
        search.sendKeys("selenium");
        search.submit();
        WebElement searchArea = driver.findElement(By.id("search"));
        searchArea.isDisplayed();
    }
}
