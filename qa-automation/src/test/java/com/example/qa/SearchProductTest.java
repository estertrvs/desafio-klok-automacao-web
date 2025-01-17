package com.example.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchProductTest extends BaseTest {

    @Test
    public void testSearchProduct() {
        openSite("https://www.magazineluiza.com.br");

        // Pode usar uma query estática ou dinâmica
        String searchQuery = System.getProperty("searchQuery", "notebook");
        performSearch(searchQuery);

        WebElement productList = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@data-testid='product-list']")
        ));
        assertTrue(productList.isDisplayed(), "A lista de produtos não foi exibida.");
    }
}
