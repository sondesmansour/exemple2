package AuthentificationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationTest1 {
WebDriver driver;
	
	@Given("Ovriree Navigateur")
	public void ovriree_navigateur() {
System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Ovrire URRL {string}")
	public void ovrire_urrl(String string) {
		 driver.get(string);
	}

	@When("SAISIR usernameee {string}")
	public void saisir_usernameee(String string) {

		WebElement user;
		user = driver.findElement(By.name("username"));
		user.sendKeys(string);
	}

	@When("SAISIR passworddd {string}")
	public void saisir_passworddd(String string) {
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys(string);
	}

	@When("Cliquerrr sur connecter")
	public void cliquerrr_sur_connecter() {
		WebElement btn;
		   btn = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
		   
		   Actions action = new Actions(driver);
		   action.click(btn).perform();
		
		
	}

	@Then("verifiiier page d accuiel ovrire {string}")
	public void verifiiier_page_d_accuiel_ovrire(String string) {
		WebElement profil;
		profil = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]"));
		
		String nom;
		nom=profil.getText();
		
		Assert.assertEquals(nom, string);
		System.out.println("compte utilisateur a verifier");
	}
}
