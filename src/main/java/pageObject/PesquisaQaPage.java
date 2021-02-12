package pageObject;

import core.Core;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PesquisaQaPage extends Core {

    public PesquisaQaPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='menu-principal-container']//li//a[text()='Pesquisa – QA']")
    private WebElement pesquisaQaLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-5']")
    private WebElement nomeLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-6']")
    private WebElement sobrenomeLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-7']")
    private WebElement emailLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-8']")
    private WebElement confirmacaoLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-17']")
    private WebElement telefoneLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-label-class-field-10-0']")
    private WebElement idadeLink;

    @FindBy(how = How.XPATH, using = "//select[@id='nf-field-11']")
    private WebElement tempoQaLink;

    @FindBy(how = How.XPATH, using = "//select[@id='nf-field-12']")
    private WebElement atracaoLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-13-0']")
    private WebElement melhorarLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-14']")
    private WebElement linguagemLink;

    @FindBy(how = How.XPATH, using = "//textarea[@id='nf-field-15']")
    private WebElement carreiraLink;

    @FindBy(how = How.XPATH, using = "//input[@id='nf-field-16']")
    private WebElement enviarLink;

    @FindBy(how = How.XPATH, using = "//div[@class='nf-response-msg']//p[text()='Your form has been successfully submitted.']")
    private WebElement mensagemSucessoLink;



    public WebElement getPesquisaQaLink(){
        return this.pesquisaQaLink;
    }

    public WebElement getNomeLink(){
        return this.nomeLink;
    }

    public WebElement getSobrenomeLink(){
        return this.sobrenomeLink;
    }

    public WebElement getEmailLink(){
        return this.emailLink;
    }

    public WebElement getConfirmacaoLink(){
        return this.confirmacaoLink;
    }

    public WebElement getTelefoneLink(){
        return this.telefoneLink;
    }

    public WebElement getIdadeLink(){
        return this.idadeLink;
    }

    public WebElement getTempoQaLink(){
        return this.tempoQaLink;
    }

    public WebElement getAtracaoLink(){
        return this.atracaoLink;
    }

    public WebElement getMelhorarLink(){
        return this.melhorarLink;
    }

    public WebElement getLinguagemLink(){
        return this.linguagemLink;
    }

    public WebElement getCarreiraLink(){
        return this.carreiraLink;
    }

    public WebElement getEnviarLink(){
        return this.enviarLink;
    }

    public WebElement getMensagemSucessoLink(){
        return this.mensagemSucessoLink;
    }
}
