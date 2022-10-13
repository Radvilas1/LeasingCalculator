package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class leasingCalculator  {
	
	public static final String calcURL = "https://www.seb.lt/eng/private/calculator-leasing";
	public static final String cookiesbuttonxpath = "/html/body/div[3]/div/div/div/div[4]/div[1]/a";
	public static final String calcframe = "calculator-frame-06";
	
	WebDriver driver;

	public leasingCalculator(WebDriver driver) {
		this.driver=driver;
	}
	
	public void main(String[] args) {

		//Before test
		//Setting the driver executable
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Open URL
		driver.get(calcURL);
		
		//Accept cookies
		driver.findElement(By.xpath(cookiesbuttonxpath)).click();
		
		//Switch to calculator frame
		driver.switchTo().frame(calcframe);

}

	
}
