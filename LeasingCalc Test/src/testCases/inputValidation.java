package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.leasingCalculator;

public class inputValidation {
	public static final String submitbuttonxpath = "/html/body/div/form/fieldset/div/div[1]/footer/div[2]/button";
	
	public static final String carprice_input = "ABC";
	public static final String interest_input = "ABC";
	public static final String initpayment_input = "ABC";
	public static final String residualvalue_input = "ABC";
	
	WebDriver driver;

	public inputValidation(WebDriver driver) {
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
		System.out.println("Start of inputValidation test.");
		
		//Declare carprice element
		WebElement carprice = driver.findElement(carpriceID);
		
		//Enter carprice value
		carprice.sendKeys(carprice_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();
		
		//Evaluate test results
		if (carprice.getAttribute("class").equals("w100 error"))
		{
			System.out.println("Car price input input validation test - PASSED!");
		} else {
			System.out.println("Car price input input validation test - FAILED!");
		}
	
		
		//Declare interest element
		WebElement interest = driver.findElement(interestID);
		
		//Clear default input
		interest.clear();
		
		//Enter interest value
		interest.sendKeys(interest_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();
		
		//Evaluate test results
		if (interest.getAttribute("class").equals("w100 error"))
		{
			System.out.println("Interest input validation test - PASSED!");
		} else {
			System.out.println("Interest input validation test - FAILED!");
		}
		
		
		//Declare initial payment element
		WebElement initpayment = driver.findElement(initpaymentID);
		
		//Clear default input
		initpayment.clear();
		
		//Enter initial payment value
		initpayment.sendKeys(initpayment_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();
		
		//Evaluate test results
		if (initpayment.getAttribute("class").equals("w100 error"))
		{
			System.out.println("Initial payment input validation test - PASSED!");
		} else {
			System.out.println("Initial payment input validation test - FAILED!");
		}
		
		
		//Declare residual value element
		WebElement residualvalue = driver.findElement(residualvalueID);
		
		//Clear default input
		residualvalue.clear();
		
		//Enter residual value
		residualvalue.sendKeys(residualvalue_input);
	
		//Click Submit button
		driver.findElement(By.xpath(submitbuttonxpath)).click();
		
		//Evaluate test results
		if (residualvalue.getAttribute("class").equals("w100 error"))
		{
			System.out.println("Residual value input validation test - PASSED!");
		}else {
			System.out.println("Residual value input validation test - FAILED!");
		}
		
		//State start of test into console
		System.out.println("End of inputValidation test.");
		
		//Close browser
		driver.close();
		
		}

	
}
