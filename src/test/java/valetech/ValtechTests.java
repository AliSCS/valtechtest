package valetech;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SourceType;

import java.io.IOException;

/**
 * Created by Ali on 09/02/2018.
 */
public class ValtechTests extends AbstractDriver {
    protected WebDriver driver = getDriver();
    WebElement latestNews;
    WebElement about;

@Test
    public void assertLatestNews(){
        driver.get("https://www.valtech.com/");
        driver.manage().window().maximize();
        latestNews = driver.findElement(By.className("news-post__listing-header"));
        Assert.assertEquals("LATEST NEWS", latestNews.getText());

        driver.findElement(By.xpath("//a[@href='/about/']")).click();
        Assert.assertEquals("About", driver.findElement(By.xpath("//div[@class='page-header']/h1")).getText());

        /// I ran out of time and would do the services in a similar way and the    work

//
//        about= driver.findElement(By.xpath("//li[@class='navigation__menu__item'][0]/a"));
//    System.out.println(about.getText());

    }



}
