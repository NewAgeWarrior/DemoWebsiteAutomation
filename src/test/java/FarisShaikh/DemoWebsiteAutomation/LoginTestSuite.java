package FarisShaikh.DemoWebsiteAutomation;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class LoginTestSuite {
	
	@Test(groups = "FunctionalTest",priority = 7)
	public void LoginTestSuiteValidCred() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite1exe\\loginpage1.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		email.sendKeys("standard_user");
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite1exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		password1.sendKeys("secret_sauce");
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite1exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();		
		
		By SwagLabs = By.xpath("//div[@class='app_logo']");
		
		WebElement swagLabs = driver.findElement(SwagLabs);
		
		String swag_Text = swagLabs.getText();
		
		File f3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File file_one = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite1exe\\swaglabs.jpg");
		
		try {
			Files.copy(f3, file_one);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(swag_Text, "Swag Labs");
		equals(swag_Text.contains("SwagLabs"));
		
		
		
		
		driver.quit();
		
	}
	
	@Test(groups = "FunctionalTest",priority = 6)
	public void LoginTestSuiteWithWrongPassword() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite2exe\\loginpage2.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		email.sendKeys("standard_user");
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite2exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		password1.sendKeys("secrt_sauce");
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite2exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();	
		
		By error = By.xpath("//div[@class='error-message-container error']");
		
		WebElement errors = driver.findElement(error);
		String error_Text = errors.getText();
		
		File f3 = errors.getScreenshotAs(OutputType.FILE);

		File error_Message = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite2exe\\error_message.jpg");
		
		try {
			Files.copy(f3, error_Message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File b = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite2exe\\fullscreen.jpg");
		
		try {
			Files.copy(f4,b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(error_Text, "Epic sadface: Username and password do not match any user in this service");
		equals(error_Text.contains("Username"));
		
		driver.quit();
		
	}
	
	@Test(groups = "FunctionalTest",priority = 5)
	public void LoginTestSuiteWithWrongUsername() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite3exe\\loginpage2.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		email.sendKeys("standard_ser");
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite3exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		password1.sendKeys("secret_sauce");
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite3exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();	
		
		By error = By.xpath("//div[@class='error-message-container error']");
		
		WebElement errors = driver.findElement(error);
		String error_Text = errors.getText();
		
		File f3 = errors.getScreenshotAs(OutputType.FILE);

		File error_Message = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite3exe\\error_message.jpg");
		
		try {
			Files.copy(f3, error_Message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File b = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite3exe\\fullscreen.jpg");
		
		try {
			Files.copy(f4,b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(error_Text, "Epic sadface: Username and password do not match any user in this service");
		equals(error_Text.contains("Username"));
		
		driver.quit();
		
	}
	
	@Test(groups = "FunctionalTest",priority = 4)
	public void LoginTestSuiteWithOnlyUsername() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite4exe\\loginpage2.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		email.sendKeys("standard_user");
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite4exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite4exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();	
		
		By error = By.xpath("//div[@class='error-message-container error']");
		
		WebElement errors = driver.findElement(error);
		String error_Text = errors.getText();
		
		File f3 = errors.getScreenshotAs(OutputType.FILE);

		File error_Message = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite4exe\\error_message.jpg");
		
		try {
			Files.copy(f3, error_Message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File b = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite4exe\\fullscreen.jpg");
		
		try {
			Files.copy(f4,b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(error_Text, "Epic sadface: Password is required");
		equals(error_Text.contains("Password"));
		
		driver.quit();
		
	}
	
	@Test(groups = "FunctionalTest",priority = 3)
	public void LoginTestSuiteWithOnlyPassword() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite5exe\\loginpage2.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite5exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		password1.sendKeys("secret_sauce");
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite5exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();	
		
		By error = By.xpath("//div[@class='error-message-container error']");
		
		WebElement errors = driver.findElement(error);
		String error_Text = errors.getText();
		
		File f3 = errors.getScreenshotAs(OutputType.FILE);

		File error_Message = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite5exe\\error_message.jpg");
		
		try {
			Files.copy(f3, error_Message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File b = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite5exe\\fullscreen.jpg");
		
		try {
			Files.copy(f4,b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(error_Text, "Epic sadface: Username is required");
		equals(error_Text.contains("Username"));
		
		driver.quit();
		
	}
	
	@Test(groups = "FunctionalTest",priority = 2)
	public void LoginTestSuiteWithWrongCred() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite6exe\\loginpage2.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		email.sendKeys("standad_user");
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite6exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		password1.sendKeys("secrt_sauce");
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite6exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();	
		
		By error = By.xpath("//div[@class='error-message-container error']");
		
		WebElement errors = driver.findElement(error);
		String error_Text = errors.getText();
		
		File f3 = errors.getScreenshotAs(OutputType.FILE);

		File error_Message = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite6exe\\error_message.jpg");
		
		try {
			Files.copy(f3, error_Message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File b = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite6exe\\fullscreen.jpg");
		
		try {
			Files.copy(f4,b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(error_Text, "Epic sadface: Username and password do not match any user in this service");
		equals(error_Text.contains("Username"));
		
		driver.quit();
		
	}
	
	@Test(groups = "FunctionalTest",priority = 1)
	public void LoginTestSuiteCloseBrowser() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite7exe\\loginpage.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		email.sendKeys("standard_user");
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite7exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		password1.sendKeys("secret_sauce");
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite7exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();		
		
		By SwagLabs = By.xpath("//div[@class='app_logo']");
		
		WebElement swagLabs = driver.findElement(SwagLabs);
		
		String swag_Text = swagLabs.getText();
		
		File f3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File file_one = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite7exe\\swaglabs.jpg");
		
		try {
			Files.copy(f3, file_one);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(swag_Text, "Swag Labs");
		equals(swag_Text.contains("SwagLabs"));
		
		driver.close();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		By email_Id_1= By.id("user-name");
		
		WebElement email1 = driver.findElement(email_Id_1);
		
		String email_String = email1.getText();
		

		File f4 = email1.getScreenshotAs(OutputType.FILE);

		File email_Field = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite7exe\\EmailField.jpg");
		
		try {
			Files.copy(f4, email_Field);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotEquals(email_String, "standard_user");
		

		By password_field = By.id("password");
		
		WebElement password_field1 = driver.findElement(password_field);
		
		File f5 = password_field1.getScreenshotAs(OutputType.FILE);

		File password_Field_Displayed = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite7exe\\PasswordField.jpg");
		
		try {
			Files.copy(f5, password_Field_Displayed);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String password_String = password_field1.getText();
		
		assertNotEquals(password_String, "secret_sauce");
		
		File f6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File file_two = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite7exe\\mainscreenaftercloseoperation.jpg");
		
		try {
			Files.copy(f6, file_two);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
	
	@Test(groups = "NonFunctionalTest",priority = 0)
	public void LoginTestSuiteNonGrouped() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File a = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite8exe\\loginpage1.jpg");
		
		try {
			Files.copy(f, a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By email_Id= By.id("user-name");
		
		WebElement email = driver.findElement(email_Id);
		
		email.sendKeys("standard_user");
		
		File f1 = email.getScreenshotAs(OutputType.FILE);

		File email_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite8exe\\EmailEntered.jpg");
		
		try {
			Files.copy(f1, email_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By password = By.id("password");
		
		WebElement password1 = driver.findElement(password);
		
		password1.sendKeys("secret_sauce");
		
		File f2 = password1.getScreenshotAs(OutputType.FILE);

		File password_Entered = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite8exe\\PasswordEntered.jpg");
		
		try {
			Files.copy(f2, password_Entered);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement button = driver.findElement(By.id("login-button"));
		
		button.click();		
		
		By SwagLabs = By.xpath("//div[@class='app_logo']");
		
		WebElement swagLabs = driver.findElement(SwagLabs);
		
		String swag_Text = swagLabs.getText();
		
		File f3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File file_one = new File("E:\\Maven_Demo_Automation\\DemoWebsiteAutomation\\TestScreenShort\\Login_Suite\\Suite8exe\\swaglabs.jpg");
		
		try {
			Files.copy(f3, file_one);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(swag_Text, "Swag Labs");
		equals(swag_Text.contains("SwagLabs"));
		
		
		
		
		driver.quit();
		
	}
	

}
