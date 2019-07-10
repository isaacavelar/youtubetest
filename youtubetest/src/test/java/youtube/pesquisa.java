package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pesquisa {


 static WebDriver driver;

public pesquisa(WebDriver driver) {
	this.driver = driver;
	
}



public void pesquisaryoutube() {
	
	
	
    WebElement MU = driver.findElement(By.id("search"));
	 MU.sendKeys("naruto episodio 1");
	 
	 WebElement PE = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
	 PE.click();
	
	WebElement Naruto = driver.findElement(By.xpath("//*[@id=\"video-title\"]"));
	Naruto.click();
	
	
	
	
}








}