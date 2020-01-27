package br.com.rsinet.HUB_BDD.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.HUB_BDD.PageFactory.DriverFactory;
import br.com.rsinet.HUB_BDD.PageFactory.PesquisaLupaPage;
import br.com.rsinet.HUB_BDD.ScreenShot.PrintDiretorio;
import br.com.rsinet.HUB_BDD.ScreenShot.ScreenShot;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Test_PesquisaProdutoLupa {

	public static WebDriver driver;
	private PesquisaLupaPage pesq;

	@Dado("^que estou na home do site$")
	public void que_estou_na_home_do_site() throws Throwable {

		driver = DriverFactory.AbrirSite();

	}

	@Quando("^eu clicar no icone da lupa$")
	public void eu_clicar_no_icone_da_lupa() throws Throwable {
		pesq = PageFactory.initElements(driver, PesquisaLupaPage.class);

		pesq.ClicarLupa();
	}

	@Quando("^escrever o nome de um produto$")
	public void escrever_o_nome_de_um_produto() throws Throwable {
		pesq.BuscaProduto();
	}

	@Quando("^fechar a lupa$")
	public void fechar_a_lupa() throws Throwable {
		pesq.FechaLupa();
	}

	@Quando("^clicar em um produto$")
	public void clicar_em_um_produto() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pesq.ClicarEmProduto(driver);
	}

	@Quando("^confirmar se estou na pagina do produto$")
	public void confirmar_se_estou_na_pagina_do_produto() throws Throwable {

		Assert.assertTrue(driver.getPageSource().contains("Headset H390"));

	}

	@Entao("^tiro a ScreenShot$")
	public void tiro_a_ScreenShot() throws Throwable {
		ScreenShot.getScreenShots(PrintDiretorio.pesquisaLupa, driver);
	}
	
	@Quando("^escrever o nome de um produto inexistente$")
	public void escrever_o_nome_de_um_produto_inexistente() throws Throwable {
	    pesq.BuscaProdutoInexistente();
	}

	@Quando("^confirmo se nao tem nenhum produto na tela$")
	public void confirmo_se_nao_tem_nenhum_produto_na_tela() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean nenhumEncontrado = wait.until(ExpectedConditions.textToBePresentInElementLocated(
				By.xpath("/html/body/div[3]/section/article/div[3]/div/label/span"), "No results for"));
		Assert.assertTrue(nenhumEncontrado);
	}

	@Entao("^tiro uma ScreenShot$")
	public void tiro_uma_ScreenShot() throws Throwable {
	     JavascriptExecutor js;
	     js = (JavascriptExecutor) driver;
	        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		ScreenShot.getScreenShots(PrintDiretorio.pesquisaLupa, driver);
	}

	@After
	public void fecharChrome() {
		DriverFactory.fecharChrome(driver);
	}

}
