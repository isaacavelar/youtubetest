package youtubetest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import youtube.pesquisa;

public class entraryoutube {

	
	static WebDriver driver;
	
	static pesquisa pesquisa;
	
	


@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	pesquisa = new pesquisa(driver);
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		pesquisa.pesquisaryoutube();
	}

}
