import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stage1-payment.grameenphone.com/v1/recharge/1674713144MqqSdTfAZXW1MAkxXfmBXw");
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.className("gLFyf")).sendKeys("bkash");
		//driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("amount")).clear();
		driver.findElement(By.id("amount")).sendKeys("30");
		//driver.findElement(By.xpath("//*[@id=\"recharge_step_1\"]/div[7]/button")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"recharge_step_2\"]/form/div[1]/div[4]/label")).click();
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/form[1]/div[1]/div[3]/section[2]/form[1]/div[2]/div[2]/button[1]")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"sections\"]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[1]/form[1]/input[5]")).click();
		
		
		
		
		
		
		
	
		
		
		

	}

}
