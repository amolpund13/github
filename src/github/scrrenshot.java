package github;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrrenshot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		//1st Step
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		//2nd step
		
		File destination = new File("E:\\Scrrenshot\\amol.jpg");
		
		//3rd step
		FileHandler.copy(source, destination);
		
		
	}
}