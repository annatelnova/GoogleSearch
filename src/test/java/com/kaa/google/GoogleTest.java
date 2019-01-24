package com.kaa.google;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class GoogleTest {

    private String googleSearch;
    private WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = new ChromeDriver();
        googleSearch = "https://www.google.com.ua/";
        webDriver.get(googleSearch);
        String searchText = "Test";
        By searchLocator = By.xpath(".//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
        WebElement searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        searchField.submit();
        By linkLocator = By.xpath(".//*[@id=\"rso\"]/div/div/div[2]/div/div/div[2]/div/span");
        String link = webDriver.findElement(linkLocator).getText();
        assertTrue(link.contains("test"));

    }

    @Test

    public void SearchTest() {

    }

    @AfterClass
    public void tearDown() {
        webDriver.close();
    }
}
