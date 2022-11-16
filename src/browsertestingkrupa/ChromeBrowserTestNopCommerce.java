package browsertestingkrupa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTestNopCommerce {
    public static void main(String[] args) {
        //define URL to test
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Set the key to the corresponding to the path from content root text value
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //declare an object
        WebDriver driver = new ChromeDriver();
        //launch URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //implicitly define timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        //Print the current url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        //Find Email field on login page
        WebElement emailField = driver.findElement(By.id("Email"));
        //Enter the email to email field
        emailField.sendKeys("testing123@gmail.com");
        //Find password field on login page
        WebElement passwordField = driver.findElement(By.id("Password"));
        //Enter the password to password field
        passwordField.sendKeys("testing123");
        //Close the browser
        driver.quit();
    }
}
