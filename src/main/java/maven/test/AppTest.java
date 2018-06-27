package maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
	
    public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "artifacts/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div/div/div/div[5]/div/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div/a/img")).click();
        System.out.println("Title of page: "+driver.getTitle());
        driver.quit();
    }
}
