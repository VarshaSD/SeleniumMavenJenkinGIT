package samplePackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ThirdMavenProgram {

	
	@Test
	public void test1() throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();// to launch chrome browser and ChromeDriver is constructure where ehave created object and the browser is launch.
		dr.manage().window().maximize();
		
		
		//implicit wait
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http://sampleapp.tricentis.com/101/");
		
		dr.findElement(By.xpath("//a[text()='Automobile']")).click();
			
		//it cautre screenshot ad return in file
		TakesScreenshot srcShot=dr;
		File SrcFile= srcShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile= new File("D:\\Picture\\Tulips.jpg");
				FileHandler.copy(SrcFile,DestFile);
	}
}
