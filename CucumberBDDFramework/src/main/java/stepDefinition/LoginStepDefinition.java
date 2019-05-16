//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//	WebDriver driver;
//
////https://classic.crmpro.com/login.cfm
//
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() {
//		driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com/index.html?e=1");
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "CRMPRO - CRM software for customer relationship management, sales, and support.";
//		Assert.assertEquals(actualTitle, expectedTitle);
//	}
//
//	// Regular expression:
//	// 1. \(.*)\
//	// 2. \"([^\"]*)\
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user clicks on Login button$")
//	public void user_clicks_on_Login_button() {
//
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click();",
//		driver.findElement(By.xpath("//input[@type='submit']")));
//	}
//
//	@Then("^user is on homepage$")
//	public void user_is_on_homepage() {
//		Assert.assertEquals(driver.getTitle(), "CRMPRO");
//	}	
//		
//	
//	@Then("user moves to new contact page")
//	public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");HH
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();;
//	   
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//	   driver.findElement(By.id("first_name")).sendKeys(firstname);
//	   driver.findElement(By.id("surname")).sendKeys(lastname);
//	   driver.findElement(By.id("company_position")).sendKeys(position);
//	   driver.findElement(By.xpath("//input[@type='submit' and @value = 'Save']")).click();
//	}
//	
//	@Then("^user close the browser$")
//	public void user_close_the_browser() {
//		driver.quit();
//	}
//
//}
