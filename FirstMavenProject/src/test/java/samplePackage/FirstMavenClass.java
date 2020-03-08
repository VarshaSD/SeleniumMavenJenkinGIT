package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass {


	
	@Test
	public void test1()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();// to launch chrome browser and ChromeDriver is constructure where ehave created object and the browser is launch.
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		dr.findElement(By.xpath("//a[text()='Automobile']")).click();
		
		dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
		String year="2019";
		String month="February";
		String date="1";
		
		
		String actYear= dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		while(!year.equals(actYear))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			actYear= dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		String actMonth= dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while(!month.equals(actMonth))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			actMonth= dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();	
			
		}

		
		
	}

}
