package github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D60002138638%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjw46CVBhB1EiwAgy6M4o88QwdPPHyn-SO51X6YaK3CZRToWKaJXRZ9SFTv7mrhncOZhUG-5BoCw7cQAvD_BwE%26hvadid%3D590512063151%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007740%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3Db%26hvrand%3D3781283975471178818%26hvtargid%3Dkwd-435775516503%26hydadcr%3D15701_2267224%26ie%3DUTF8%26index%3Daps%26keywords%3Damazon%2520prime%2520login%2520india%26ref%3Dpd_sl_4gb6eczzwi_b%26tag%3Dgooginhydr1-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("ap_customer_name")).sendKeys("Amol Pund");
	    Thread.sleep(2000);
	    driver.findElement(By.name("email")).sendKeys("9975414045");
	    Thread.sleep(2000);
	    driver.findElement(By.id("ap_email")).sendKeys("amol.pund@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("ap_password")).sendKeys("123456789");
	    Thread.sleep(2000);
	    driver.findElement(By.id("continue")).click();
	   	   
	}
}
