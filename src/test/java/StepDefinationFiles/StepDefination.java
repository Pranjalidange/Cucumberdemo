package StepDefinationFiles;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class StepDefination {
	public WebDriver driver;
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
        
    }
	@And("^Naviagate to \"([^\"]*)\" site$")
    public void naviagate_to_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);
    }

    @When("^When user enteres (.+) and (.+) and logs in$")
    public void when_user_enteres_and_and_logs_in(String username, String password) throws Throwable {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id='Login']")).click();

    }

    @Then("^Verify that user is succesfully signed in$")
    public void verify_that_user_is_succesfully_signed_in() throws Throwable {
        System.out.println("Login Successfully");
    }

    

    }
	