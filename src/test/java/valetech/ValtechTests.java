package valetech;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

/**
 * Created by Ali on 09/02/2018.
 */
public class ValtechTests extends AbstractDriver {
    protected WebDriver driver = getDriver();
    WebElement latestNews;
    WebElement about;
    WebDriverWait wait30;


 @Before
 public void launchSite(){
        wait30 = new WebDriverWait(driver, 60);
        driver.get("https://www.valtech.com/");
        driver.manage().window().maximize();
    }

@Test
    public void assertLatestNews() {
//    wait30 = new WebDriverWait(driver, 60);
//        driver.get("https://www.valtech.com/");
//        driver.manage().window().maximize();
    latestNews = driver.findElement(By.className("news-post__listing-header"));
    Assert.assertEquals("LATEST NEWS", latestNews.getText());
}

@Test
    public void assertNavBar(){
        wait30.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("about")));
        driver.findElement(By.xpath("//a[@href='/about/']/span")).click();
        Assert.assertEquals("About", driver.findElement(By.xpath("//div[@class='page-header']/h1")).getText());

        driver.findElement(By.xpath("//a[@href='/work/']/span")).click();
        Assert.assertEquals("Work", driver.findElement(By.xpath("//header[@class='page-header']/h1")).getText());


        driver.findElement(By.xpath("//a[@href='/services/']/span")).click();
//        Assert.assertEquals("Work", driver.findElement(By.xpath("//div[@class='page-header']/h1")).getText());

        List<WebElement> anchors = driver.findElements(By.xpath("//div[@class='sub-menu-wrapper']/a"));
            int anchorCount = anchors.size();
//            System.out.println(anchorCount);
            for(WebElement myAnchor : anchors){
                System.out.println(myAnchor.getText());
            }


        closeDriver();
    }



}



