package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import br.com.rsinet.HUB_BDD.PageFactory.DriverFactory;
import br.com.rsinet.HUB_BDD.PageFactory.HomePage;
import br.com.rsinet.HUB_BDD.PageFactory.SpecialPage;
import br.com.rsinet.HUB_BDD.ScreenShot.PrintDiretorio;
import br.com.rsinet.HUB_BDD.ScreenShot.ScreenShot;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Test_PesquisarAtravesDaHomePage {
	public static WebDriver driver;
	private HomePage inicio;
	private SpecialPage tablets;
	
	@Dado("^que estou na pagina inicial do site$")
	public void que_estou_na_pagina_inicial_do_site() {
		driver = DriverFactory.AbrirSite();
	}

	@Quando("^eu clicar em tablet$")
	public void eu_clicar_em_tablet() {
		inicio = PageFactory.initElements(driver, HomePage.class);
		inicio.tablet();
	}

	@Quando("^selecionar um dos tablets da lista$")
	public void selecionar_um_dos_tablets_da_lista() throws Throwable {
		tablets = PageFactory.initElements(driver, SpecialPage.class);
		tablets.Hp_Pro(driver);
	}

	@Quando("^confirmar que foi selecionado$")
	public void confirmar_que_foi_selecionado() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean semResultado = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/h1"), "HP PRO TABLET"));
		Assert.assertTrue(semResultado);
	}

	@Entao("^confirmo com uma ScreenShot$")
	public void confirmo_com_uma_ScreenShot() throws Throwable {
		ScreenShot.getScreenShots(PrintDiretorio.pesquisaHome, driver);
	}
	@Quando("^escolher uma opcao de tamanho de tela$")
	public void escolher_uma_opcao_de_tamanho_de_tela() throws Throwable {
		SpecialPage click = PageFactory.initElements(driver, SpecialPage.class);
		click.tela(driver);
	}

	@Quando("^escolher uma opcao de processador$")
	public void escolher_uma_opcao_de_processador() throws InterruptedException {
		SpecialPage click = PageFactory.initElements(driver, SpecialPage.class);
	
		click.Processador(driver);		
	}

	@Quando("^confirmar se retorna algum tablet$")
	public void confirmar_se_retorna_algum_tablet() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean semResultado = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[3]/label/span"), "No results"));
		Assert.assertTrue(semResultado);
	}

	@Entao("^tirar uma screenshot$")
	public void tirar_uma_screenshot() throws Throwable {
		ScreenShot.getScreenShots(PrintDiretorio.pesquisaHome, driver);
	}
	@After
	public void fecharChrome() {
		DriverFactory.fecharChrome(driver);
 	}

}
