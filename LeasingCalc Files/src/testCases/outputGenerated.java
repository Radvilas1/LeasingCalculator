package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.leasingCalculator;

public class outputGenerated {
	public static final String submitbuttonxpath = "/html/body/div/form/fieldset/div/div[1]/footer/div[2]/button";
	public static final String monthlypayment = "/html/body/div/form/fieldset/div/div[2]/div[3]/div[2]/span[1]";
	public static final String commision = "/html/body/div/form/fieldset/div/div[2]/div[4]/div[2]/span[1]";
	public static final String initialpayment = "/html/body/div/form/fieldset/div/div[2]/div[5]/div[2]/span[1]";
	
	public static final String carprice_input = "A";
	public static final String interest_input = "1";
	public static final String initpayment_input = "1";
	public static final String residualvalue_input = "1";
	
	WebDriver driver;

	public outputGenerated(WebDriver driver) {
		this.driver=driver;
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		leasingCalculator home = new leasingCalculator(driver);
		home.main(args);
		
		By carpriceID = By.id("f-summa");
		By interestID = By.id("f-likme");
		By initpaymentID = By.id("f-maksa");
		By residualvalueID = By.id("f-rest");
		
		//Test
		
		//State start of test into console
		System.out.println("Start of outputGenerated test.");
		
		
		//Declare carprice element
		WebElement carprice = driver.findElement(carpriceID);
		
		//Enter carprice value
		carprice.sendKeys(carprice_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();
	
		
		//Declare interest element
		WebElement interest = driver.findElement(interestID);
		
		//Clear default input
		interest.clear();
		
		//Enter interest value
		interest.sendKeys(interest_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();

		
		//Declare initial payment element
		WebElement initpayment = driver.findElement(initpaymentID);
		
		//Clear default input
		initpayment.clear();
		
		//Enter initial payment value
		initpayment.sendKeys(initpayment_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();
		
		
		//Declare residual value element
		WebElement residualvalue = driver.findElement(residualvalueID);
		
		//Clear default input
		residualvalue.clear();
		
		//Enter residual value
		residualvalue.sendKeys(residualvalue_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();
		
		
		//Declare monthly payment output element
		String monthlypaymentvalue = driver.findElement(By.xpath(monthlypayment)).getText();
		
		//Declare commision fee output element
		String commisionvalue = driver.findElement(By.xpath(commision)).getText();
		
		//Declare initial payment  output element
		String initialpaymentvalue = driver.findElement(By.xpath(initialpayment)).getText();

		
		//Evaluate output results
		if (monthlypaymentvalue.equals("-")){
			System.out.println("Output generated test - FAILED!");
			
		} else if (commisionvalue.equals("-")) {
			System.out.println("Output generated test - FAILED!");
			
		} else if (initialpaymentvalue.equals("-")) {
			System.out.println("Output generated test - FAILED!");
			
		}else {
			System.out.println("Output generated test - PASSED!");
		}
		
		//State start of test into console
		System.out.println("End of outputGenerated test.");
		
		//Close browser
		driver.close();
		
		}

	
}
