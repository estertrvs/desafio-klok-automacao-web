package com.example.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonExistentProductTest extends BaseTest {

    @Test
    public void testSearchNonExistentProduct() {
        openSite("https://www.magazineluiza.com.br");

        performSearch("kkkkkkkkkkkkkkkkk");

        WebElement noResultsMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h1[@data-testid='text-list-title']")
        ));
        String actualMessage = noResultsMessage.getText();

        String expectedMessage = "não encontrou resultado algum :(";
        assertTrue(actualMessage.contains(expectedMessage), "A mensagem esperada não foi exibida.");
    }
}
