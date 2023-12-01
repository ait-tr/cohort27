package com.ait.qa27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.berlin.de");
        //maximize browser to window with
        driver.manage().window().maximize();
        //wait for all elements on the site to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementsByTag() {
        //find element by tag
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element);

        //find list of elements by tag
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @Test
    public void findElementsByLocators() {
        //by id
        driver.findElement(By.id("layout-grid__area--contentheader"));

        //by class
        driver.findElement(By.className("logo"));

        //by link text
        driver.findElement(By.linkText("Aktuelle Meldungen"));

        //by partial link text
        driver.findElement(By.partialLinkText("Meldungen"));
    }

    @Test
    public void findElementByCssSelector() {
        //by id -> #id
        // driver.findElement(By.id("layout-grid__area--contentheader"));
        driver.findElement(By.cssSelector("#layout-grid__area--contentheader"));

        //by class -> .class
        // driver.findElement(By.className("logo"));
        driver.findElement(By.cssSelector(".logo"));

        //[attr = 'value']
        driver.findElement(By.cssSelector("[title='Weiterblättern']"));
    }

    @Test
    public void findElementByXpath() {
        // -> //*[@attr='value']
        driver.findElement(By.xpath("//*[@title='Weiterblättern']"));

        // xpath by text
        driver.findElement(By.xpath("//label[contains(.,'Informationen zu:')]"));
        driver.findElement(By.xpath("//label[text()='Berlin, ich brauche Informationen zu:']"));
        driver.findElement(By.xpath("//label[.='Berlin, ich brauche Informationen zu:']"));
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.quit();
    }
}
