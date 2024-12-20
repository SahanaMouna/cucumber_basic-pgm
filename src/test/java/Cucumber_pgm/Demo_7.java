package Cucumber_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Demo_7 {
		ChromeDriver driver=new ChromeDriver();
		
		@Given("^|I visited tutorialsninja website$")
		public void I_visited_tutorialsninja_website() {
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		}
		@And("^|click myAccount$")
		public void click_myAccount() {
			driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
		}
		@When("^|we can see login button and click$")
		public void we_can_see_login_button_and_click() {
			driver.findElement(By.linkText("Login")).click();
		}
		@And("^|enter username and password$")
		public void enter_username_and_password() {
		driver.findElement(By.id("input-email")).sendKeys("sandhiyashikshaa@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		}
		@Then("^|I clicked login button$")
		public void I_clicked_login_button() {
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
		}
		@And("^|Home page is displayed$")
		public void Home_page_is_displayed () {
			 String name = driver.findElement(By.xpath("//h2[text()=\"My Account\"]")).getText();
			  System.out.println(name);
			 // Assert.assertEquals(name, "My Account"); 
			 Assert.assertEquals(name,"My Account");
		
}
}