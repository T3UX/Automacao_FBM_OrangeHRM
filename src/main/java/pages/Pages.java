package pages;

import dsl.DSL;
import org.openqa.selenium.WebDriver;

public class Pages {

    private DSL dsl;

    String user = "Admin";
    private String password = "admin123";
    private String incorrectUser = "OUIEYRIWEUR";
    private String incorrectPassword = "QWERTY!@@#$%";

    public Pages(WebDriver driver){
        dsl = new DSL(driver);
    }

    /********* Acessar Site ************/
    public void acessSite() {
        dsl.acessarSite();
    }

    /********* Fechar Navegador ************/
    public void closeDriver() {
        dsl.fecharNavegador();
    }

    /********* Login ************/
    public void setCorrectLogin() {
        dsl.escreverXpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input", user);
    }
    public void setCorrectPassword() {
        dsl.escreverXpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input", password);
    }

    public void setIncorrectLogin() {
        dsl.escreverXpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input", incorrectUser);
    }
    public void setIncorrectPassword() {
        dsl.escreverXpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input", incorrectPassword);
    }

    /********* Preecher Campos ************/
    public void setFirstName(String text) {
        dsl.escreverXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input", text);
    }

    public void setMiddleName(String text) {
        dsl.escreverXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input", text);
    }

    public void setLastName(String text) {
        dsl.escreverXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input", text);
    }

    public void setRegisteredName(String text) {
        dsl.escreverXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input", text);
    }

    public void setDriveLicense(String text) {
        dsl.escreverXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input", text);
    }

    public void setOtherId(String text) {
        dsl.escreverXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input", text);
    }

    /********* Clicks ************/
    public void clickSubmit(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    }

    public void clickPim(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
    }

    public void clickAddEmployee(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[3]");
    }

    public void clickSaveEmployee(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
    }

    public void clickEmployeeList(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]");
    }

    public void clickSearchRegistered(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
    }

    public void clickSaveRegistryChanges(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button");
    }

    public void clickResetFilter(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");
    }

    public void clickDeletRegister(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]");
    }

    public void clickConfirmDeletRegister(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[3]/div/div/div/div[3]/button[2]");
    }

    public void clickEditEmployee(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]");
    }

    public void clickGender(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span");
    }

    public void clickSavechanges(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button");
    }

    public void clickUserOptions(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span");
    }

    public void clickLogout(){
        dsl.clicarBotaoComXpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a");
    }

    /********* Obtem Mensagens ************/
    public String invalidLoginMessage(){
        return dsl.obterTexto("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
    }
    public String invalidPasswordMessage(){
        return dsl.obterTexto("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
    }
    public String invalidCredentialsMessage(){
        return dsl.obterTexto("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
    }

    public String getNameRegister(){
        return dsl.obterTexto("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div");
    }

    /********* Aguarda o Navegador ************/
    public void waitBrowser(){
        dsl.aguardaPagina(9);
    }

    /********* Valida Mensagem Exibida em Tela ************/

    public void deletionMessageVerify(){
        dsl.encontraMensagem("//*[@id='oxd-toaster_1']");
    }

}
