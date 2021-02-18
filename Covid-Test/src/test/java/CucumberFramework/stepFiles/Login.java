package CucumberFramework.stepFiles;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Login {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\phumudzo.khadiamovha\\eclipse projects\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(6000, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60000, TimeUnit.SECONDS);
	}
	
//only when using firefox to test i can uncomment the below and comment the above chrome setup
//	@Before
//	public void setup_firefox() {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\phumudzo.khadiamovha\\eclipse projects\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\geckodriver.exe");
//		firefoxOptions.setCapability("marionette", true);
//		this.driver = new FirefoxDriver(firefoxOptions);
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
//	}
 
	
//Not using the code as yet but its used to close down the browser after running test
//	@After
//	public void tearDown() throws InterruptedException {
//		this.driver.manage().deleteAllCookies();
//		this.driver.quit();
//		this.driver = null;
//	}
		
	private void clickElement(WebElement element) {
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", element);
	} 
	
	@Given("^User navigates to covid app$")
	public void user_navigates_to_covid_app() throws Throwable {
		driver.get("https://covidstreamline.com/");
	}
	
	@And("^User clicks on the accept button on homepage$")
	public void user_clicks_on_the_accept_button_on_homepage() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/div[2]/button")).click();
	}

	@When("^User clicks the visitor button$")
	public void user_clicks_the_visitor_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div[1]/button")).click();
	}
	
	@Then("^User enters fullname$")
	public void user_enters_fullname() throws Throwable {
		driver.findElement(By.xpath(".//*[@id=\"input1\"]")).sendKeys("John Walker");
	}

	@And("^User enters a valid ID number$")
	public void user_enters_a_valid_ID_number() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id=\"input2\"]")).sendKeys("abc");
	}

	@And("^User enters a valid contact number or email$")
	public void user_enters_a_valid_contact_number_or_email() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id=\"input3\"]")).sendKeys("0678096063");
	}

	@Then("^User selects reason for visit by clicking the dropdown arrow$")
	public void user_selects_reason_for_visit_by_clicking_the_dropdown_arrow() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id=\"input10\"]")).sendKeys("Meeting");
	}
	
	@And("^User selects location by clicking the dropdown arrow$")
	public void user_selects_location_by_clicking_the_dropdown_arrow() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id=\"select\"]")).sendKeys("The Campus-Wanderers West-Second Floor-Client Experience");
	}
	
	@Then("^User enters temperature measured$")
	public void user_enters_temperature_measured() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id=\"2TempuratureInput\"]")).sendKeys("3");
	}
	
	@And("^User enters a valid residential location$")
	public void user_enters_a_valid_residential_location() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id=\"residentialLocation\"]")).sendKeys("Randfontein");
	}
	
	@Then("^User clicks do you have a mask label$")
	public void user_clicks_do_you_have_a_mask_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/form/div[8]/div[1]/div/label")).click();
	}
	
	@And("^User clicks do you have hand sanitizer label$")
	public void user_clicks_do_you_have_hand_sanitizer_label() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/form/div[8]/div[2]/div/label")).click();
	}
	
//optional step for first test 
//	@And("^User clicks i am not label$")
//	public void user_clicks_i_am_not_label() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//button[@class = 'btn btn-secondary active' and @type = 'radio']")).click();
//	}
	
	@When("^User clicks the save button$")
	public void user_clicks_the_save_button() throws Throwable {
		Thread.sleep(2000);
		WebElement saveButton = driver.findElement(By.cssSelector(".btn-info"));
	    clickElement(saveButton);
	    System.out.println(saveButton);
	}
	
//TODO: fix the element to find		
//	@Then("^User should be taken to the QR code page$")
//	public void user_should_be_taken_to_the_QR_code_page() throws Throwable {
//		Thread.sleep(3000);
//		WebElement AuthorizedPassportQRCode = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]"));
//		Assert.assertEquals(true, AuthorizedPassportQRCode.isDisplayed());
//	}
}



