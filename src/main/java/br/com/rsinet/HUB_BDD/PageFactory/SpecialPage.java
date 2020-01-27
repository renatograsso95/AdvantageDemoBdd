package br.com.rsinet.HUB_BDD.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import br.com.rsinet.HUB_BDD.Excel.MassaPesquisaHome;

public class SpecialPage {
	MassaPesquisaHome celula = new MassaPesquisaHome();

	@FindBy(how = How.ID, using = "accordionAttrib0")
	public WebElement Display;

	@FindBy(how = How.ID, using = "display_0")
	public WebElement specialities;

	@FindBy(how = How.ID, using = "accordionAttrib1")
	public WebElement processador;
	
	@FindBy(how = How.ID, using = "processor_1")
	public WebElement Atom;
	
	
	public void Hp_Pro(WebDriver driver) throws Exception {
		driver.findElement(By.partialLinkText(celula.HP_Pro())).click();
	}
	
	public void tela (WebDriver driver) {
		Display.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		specialities.click();
		Display.click();
	}
	public void Processador (WebDriver driver) {
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000)");
		processador.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Atom.click();
		processador.click();
	}


}
