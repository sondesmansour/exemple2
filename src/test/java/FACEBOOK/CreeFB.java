package FACEBOOK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class CreeFB {

	WebDriver driver;
	
	@Given("Ovrire navigateur")
	public void ovrire_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@Given("acceder URL {string}")
	public void acceder_url(String string) {
	    driver.get(string);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Cliquer sur button cree nouveau")
	public void cliquer_sur_button_cree_nouveau() {
	   WebElement BtnCree;
	   BtnCree = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
	  // BtnCree.click();
	   Actions action= new Actions(driver);
	   action.click(BtnCree).perform();
	} 
	
	@When("saisir prenom {string}")
	public void saisir_prenom(String string) {
		WebElement prenom;
		prenom = driver.findElement(By.name("firstname"));
	    
		prenom.sendKeys(string);
	}
	
	@When("saisir nom {string}")
	public void saisir_nom(String string) {
		WebElement nom;
		nom = driver.findElement(By.name("lastname"));
	    
		nom.sendKeys(string);
	}

	@When("saisir email {string}")
	public void saisir_email(String string) {
		WebElement email;
		email = driver.findElement(By.name("reg_email__"));
	    
		email.sendKeys(string);
	    
	}
	
	@When("saisir comfEmail {string}")
	public void saisir_comf_email(String string) {
		WebElement Confemail;
		Confemail = driver.findElement(By.name("reg_email_confirmation__"));
	    
		Confemail.sendKeys(string);
	    
	}

	@When("saisir password {string}")
	public void saisir_password(String string) {
		WebElement password;
		password = driver.findElement(By.name("reg_passwd__"));
	    
		password.sendKeys(string);
	}

	@When("saisir jour {string}")
	public void saisir_jour(String string) {
		WebElement jour;
		jour = driver.findElement(By.name("birthday_day"));
	    
		jour.sendKeys(string);
	}

	@When("saisir mois {string}")
	public void saisir_mois(String string) {
		WebElement mois;
		mois = driver.findElement(By.name("birthday_month"));
	    
		mois.sendKeys(string);
	}

	@When("saisir annee {string}")
	public void saisir_annee(String string) {
	    WebElement annee;
	    annee = driver.findElement(By.name("birthday_year"));
	    
	    annee.sendKeys(string);
	}
	
	@When("choisir et cliquer sur button de genre")
	public void choisir_et_cliquer_sur_button_de_genre() {
		 WebElement genre;
		 genre = driver.findElement(By.xpath("//label[normalize-space()=\"Homme\"]"));
		//label[normalize-space()="Homme"]
		//label[normalize-space()=\"Femme\"]
		   Actions action= new Actions(driver);
		   action.click(genre).perform();
	}
	
	@When("Cliquer sur button s insecrire")
	public void cliquer_sur_button_s_insecrire() {
		  WebElement BtnInsecrire;
		  BtnInsecrire = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		
		   Actions action= new Actions(driver);
		   action.click(BtnInsecrire).perform();
	}


}
