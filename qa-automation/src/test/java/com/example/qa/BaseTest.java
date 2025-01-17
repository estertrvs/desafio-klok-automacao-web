package com.example.qa;

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void openSite(String url) {
        driver.get(url);
    }

    protected WebElement getSearchField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//input[@id='input-search']")
        ));
    }

    protected WebElement getSearchButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@data-testid='search-submit']")
        ));
    }

    protected void performSearch(String query) {
        WebElement searchField = getSearchField();
        searchField.clear();
        searchField.sendKeys(query);

        WebElement searchButton = getSearchButton();
        searchButton.click();
    }
}

