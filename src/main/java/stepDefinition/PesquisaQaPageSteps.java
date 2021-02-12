package stepDefinition;

import core.DSL;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import pageObject.PesquisaQaPage;



public class PesquisaQaPageSteps extends DSL {

    private PesquisaQaPage pesquisaQaPage;

    public PesquisaQaPageSteps(){
        super();
        pesquisaQaPage = new PesquisaQaPage();
    }

    @Dado("que eu acesse a página da VV Test")
    public void abrirPagina(){
        getDriver().get("https://bit.ly/3jOMrR9");
    }

    @E("acesse o menu Pesquisa - QA")
    public void acessoMenu(){
        clickWebElement(pesquisaQaPage.getPesquisaQaLink());
    }

    @Quando("eu preencher todos os campos obrigatórios")
    public void preencherCamposObrigatorios(){
        fillStringInput(pesquisaQaPage.getNomeLink(), "Via");
        fillStringInput(pesquisaQaPage.getSobrenomeLink(), "Varejo");
        fillStringInput(pesquisaQaPage.getEmailLink(), "teste@teste.com.br");
        fillStringInput(pesquisaQaPage.getConfirmacaoLink(), "teste@teste.com.br");
        fillStringInput(pesquisaQaPage.getTelefoneLink(),"71999785684");
        clickRadio(By.id("nf-label-class-field-10-1"));
        selectComboOption(pesquisaQaPage.getTempoQaLink(),"mais de 5 anos");
        selectComboOption(pesquisaQaPage.getAtracaoLink(),"Desafio");
        clickRadio(By.id("nf-label-class-field-13-0"));
        fillStringInput(pesquisaQaPage.getLinguagemLink(),"Ruby");
        fillStringInput(pesquisaQaPage.getCarreiraLink(),"Entrar na Via Varejo :)");
        clickButton(pesquisaQaPage.getEnviarLink());
    }

    @Então("deve ser direcionado para uma página de sucesso")
    public void validarPaginaSucesso() {
        wait(pesquisaQaPage.getMensagemSucessoLink());
        visible(pesquisaQaPage.getMensagemSucessoLink());
    }
}
