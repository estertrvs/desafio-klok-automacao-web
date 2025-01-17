package com.example.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IncompleteSearchTest extends BaseTest {

    @Test
    public void testIncompleteSearch() {
        openSite("https://www.magazineluiza.com.br");

        // Pode usar uma query estática ou dinâmica
        String searchQuery = System.getProperty("searchQuery", "cel");
        performSearch(searchQuery);

        WebElement resultMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[@data-testid='did-you-mean']")
        ));
        String message = resultMessage.getText();

        String expectedMessage = "Em vez disso, pesquisar por";
        assertTrue(message.contains(expectedMessage), "A mensagem esperada não foi exibida.");
    }
}
