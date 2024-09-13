package dsl;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class DSL {

    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    /********* Acessar o Site ************/
    public void acessarSite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    /********* Fechar o Site ************/
    public void fecharNavegador(){
        driver.quit();
    }

    /********* TextField e TextArea ************/
    public void escreverXpath(String xpath, String texto){
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(texto);
    }

    public String obterTexto(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }

    /********* Botao ************/
    public void clicarBotaoComXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    /********* Aguarda Pagina ************/
    public void aguardaPagina(Integer seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    /********* Encontra Elemento ************/
    public void encontraMensagem(String xpath){
        driver.findElement(By.xpath(xpath));
    }

}
