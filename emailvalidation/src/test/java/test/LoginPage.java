package test;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	private WebDriver browser;
	private String startUrl;

	@Before
	public void readyBrowser() throws Exception {
				
		browser = new ChromeDriver();
		startUrl = "http://accounts.google.com";
		
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
	}
	@Test
	public void TypeLogin() throws Exception {
		browser.get(startUrl + "/ServiceLogin?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		browser.findElement(By.xpath(".//*[@id='identifierId']")).clear();
		browser.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("TestJUnit123@gmail.com");
		browser.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		browser.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("JUnit123");
		browser.findElement(By.xpath(".//*[@id='passwordNext']/content")).click();
		
		//aqui tentei criar um novo e-mail mas não deu certo:
		
		//browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//browser.findElement(By.xpath(".//*[@id=':y1']/div/div")).click();
		//browser.findElement(By.xpath(".//*[@id='13t']")).sendKeys("TestJUnit123@gmail.com");
		//browser.findElement(By.xpath(".//*[@id='13b']")).sendKeys("test subject");
		//browser.findElement(By.xpath(".//*[@id='14g']")).sendKeys("test body");
		
		//browser.findElement(By.cssSelector("span.gb_7.gbii")).click();
		//browser.findElement(By.id("gb_71")).click(); 
		//browser.findElement(By.id("to")).clear();
		//browser.findElement(By.name("to")).sendKeys("TestJUnit123@gmail.com");
	}

	public void test() {
		fail("Not yet implemented");
	}

}
