package application;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Pages;

public class TestesUnitarios {

    private WebDriver driver;

    Pages pages = new Pages(driver);

    @Before
    public void inicializa() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pages = new Pages(driver);
        pages.acessSite();
    }


    @After
    public void finaliza(){
        driver.quit();
    }

    @Test
    public void validaCampoRequerimentoUser(){
        pages.waitBrowser();
        pages.clickSubmit();
        Assert.assertEquals("Required", pages.invalidLoginMessage());
    }

    @Test
    public void validaCampoRequerimentoPass(){
        pages.waitBrowser();
        pages.setCorrectLogin();
        pages.clickSubmit();
        Assert.assertEquals("Required", pages.invalidPasswordMessage());
    }

    @Test
    public void validaCredenciaisInvalidas(){
        pages.waitBrowser();
        pages.setIncorrectLogin();
        pages.setIncorrectPassword();
        pages.clickSubmit();
        Assert.assertEquals("Invalid credentials", pages.invalidCredentialsMessage());
    }

    @Test
    public void cadastroMultiploEmployee(){
        pages.waitBrowser();
        pages.setCorrectLogin();
        pages.setCorrectPassword();
        pages.clickSubmit();
        pages.waitBrowser();
        pages.clickPim();
        pages.waitBrowser();
        pages.clickAddEmployee();
        pages.waitBrowser();
        pages.setFirstName("Fulano");
        pages.setMiddleName("Bigos");
        pages.setLastName("One");
        pages.clickSaveEmployee();
        pages.waitBrowser();
        pages.clickSaveRegistryChanges();
        pages.waitBrowser();
        pages.clickAddEmployee();
        pages.waitBrowser();
        pages.setFirstName("Ciclano");
        pages.setMiddleName("Bigos");
        pages.setLastName("Two");
        pages.clickSaveEmployee();
        pages.waitBrowser();
        pages.clickSaveRegistryChanges();
        pages.waitBrowser();
        pages.clickAddEmployee();
        pages.waitBrowser();
        pages.setFirstName("Beltrano");
        pages.setMiddleName("Bigos");
        pages.setLastName("Three");
        pages.clickSaveEmployee();
        pages.waitBrowser();
        pages.clickSaveRegistryChanges();
    }

    @Test
    public void pesquisaEmployeeCadastrado() throws InterruptedException{
        pages.waitBrowser();
        pages.setCorrectLogin();
        pages.setCorrectPassword();
        pages.clickSubmit();
        pages.clickPim();
        pages.clickEmployeeList();
        pages.clickResetFilter();
        pages.setRegisteredName("Fulano");
        Thread.sleep(900);
        pages.clickSearchRegistered();
        Thread.sleep(900);
        Assert.assertEquals("Fulano Bigos", pages.getNameRegister());
        pages.clickResetFilter();
        pages.setRegisteredName("Ciclano");
        Thread.sleep(900);
        pages.clickSearchRegistered();
        Thread.sleep(900);
        Assert.assertEquals("Ciclano Bigos", pages.getNameRegister());
        pages.clickResetFilter();
        pages.setRegisteredName("Beltrano");
        Thread.sleep(900);
        pages.clickSearchRegistered();
        Thread.sleep(900);
        Assert.assertEquals("Beltrano Bigos", pages.getNameRegister());
    }

    @Test
    public void deletaEmployeeFulano() throws InterruptedException {
        pages.waitBrowser();
        pages.setCorrectLogin();
        pages.setCorrectPassword();
        pages.clickSubmit();
        pages.clickPim();
        pages.clickEmployeeList();
        pages.clickResetFilter();
        pages.setRegisteredName("Fulano");
        Thread.sleep(900);
        pages.clickSearchRegistered();
        Thread.sleep(900);
        pages.clickDeletRegister();
        pages.clickConfirmDeletRegister();
        pages.deletionMessageVerify();
    }

    @Test
    public void deletaEmployeeBeltrano() throws InterruptedException {
        pages.waitBrowser();
        pages.setCorrectLogin();
        pages.setCorrectPassword();
        pages.clickSubmit();
        pages.clickPim();
        pages.clickEmployeeList();
        pages.clickResetFilter();
        pages.setRegisteredName("Beltrano");
        Thread.sleep(900);
        pages.clickSearchRegistered();
        Thread.sleep(900);
        pages.clickDeletRegister();
        pages.clickConfirmDeletRegister();
        pages.deletionMessageVerify();
    }

    @Test
    public void alteraEmployeeCiclano() throws InterruptedException {
        pages.waitBrowser();
        pages.setCorrectLogin();
        pages.setCorrectPassword();
        pages.clickSubmit();
        pages.clickPim();
        pages.clickEmployeeList();
        pages.clickResetFilter();
        pages.setRegisteredName("Ciclano");
        Thread.sleep(900);
        pages.clickSearchRegistered();
        pages.clickEditEmployee();
        pages.setDriveLicense("999 999 999");
        pages.clickGender();
        pages.setOtherId("9876");
        pages.clickSavechanges();
    }

    @Test
    public void realizaLogout() {
        pages.waitBrowser();
        pages.setCorrectLogin();
        pages.setCorrectPassword();
        pages.clickSubmit();
        pages.waitBrowser();
        pages.clickUserOptions();
        pages.clickLogout();
    }
}
