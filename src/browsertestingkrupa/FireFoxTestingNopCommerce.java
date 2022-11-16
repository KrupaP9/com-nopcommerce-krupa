package browsertestingkrupa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTestingNopCommerce {
    public static void main(String[] args) {
        //define URL to test
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Set the key to the corresponding to the path from content root text value
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        //declare driver object
        WebDriver driver = new FirefoxDriver();
        //open URL
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //implicitly define timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        System.out.println("Page Title: "+driver.getTitle());
        //Print the current url
        System.out.println("Current URL: "+driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source: "+driver.getPageSource());
        //Find email field on login page
        WebElement emailField = driver.findElement(By.id("Email"));
        //Enter the email to email field
        emailField.sendKeys("testing1234@gmail.com");
        //Find password field on login page
        WebElement passwordField = driver.findElement(By.id("Password"));
        //Enter the password to password field
        passwordField.sendKeys("testing1234");
        //close the browser
        //driver.quit();
    }
}
