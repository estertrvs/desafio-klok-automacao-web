package com.example.qa;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchFieldCharacterLimitTest extends BaseTest {

    @Test
    public void testSingleCharacterSearch() throws IOException {
        openSite("https://www.magazineluiza.com.br");

        // Realizar busca com 1 caractere
        performSearch("a");

        try {
            // Validação para busca com um caractere
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@data-testid='product-list']")
            ));
            System.out.println("Teste com 1 caractere: Teste passou.");
        } catch (Exception e) {
            System.err.println("Teste com 1 caractere: Falhou.");
            throw e;
        }
    }

    @Test
    public void test255CharacterSearch() throws IOException {
        openSite("https://www.magazineluiza.com.br");

        // Gerar uma string com 255 caracteres
        String input = "a".repeat(255);
        performSearch(input);

        try {
            // Validação para busca com 255 caracteres
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@data-testid='product-list']")
            ));
            System.out.println("Teste com 255 caracteres: Teste passou.");
        } catch (Exception e) {
            System.err.println("Teste com 255 caracteres: Falhou.");
            throw e;
        }
    }

    @Test
    public void test256CharacterSearch() throws IOException {
        openSite("https://www.magazineluiza.com.br");

        // Gerar uma string com 256 caracteres
        String input = "a".repeat(256);
        performSearch(input);

        try {
            // Validação para busca com 256 caracteres
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@data-testid='product-list']")
            ));
            System.out.println("Teste com 256 caracteres: Teste passou.");
        } catch (Exception e) {
            System.err.println("Teste com 256 caracteres: Falhou.");
            throw e;
        }
    }
}
