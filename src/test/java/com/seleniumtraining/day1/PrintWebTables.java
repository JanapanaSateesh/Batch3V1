package com.seleniumtraining.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintWebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// ((//div[@class='rt-tbody']//div[@class='rt-tr-group'])[2]//div[@class='rt-td'])[5]
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']"));
		int length= list.size();
		
		for(int i=1;i<length;i++) 
		{
		String firstname=	driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[1]")).getText();
		String age=	driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[3]")).getText();
		String email=	driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[4]")).getText();
		String salary=	driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[5]")).getText();
		int bonus=10000;
		
		
		if(firstname!=null && age!=null && email!=null && salary!=null) 
		{
			int finalSalary=bonus+Integer.valueOf(salary);
			String afterStringSalaray=String.valueOf(finalSalary);
			System.out.println(firstname+" "+age+" "+email+" "+afterStringSalaray);
		}
		//System.out.println(firstname+" "+age+" "+email+" "+finalSalary);
		
		}
	}

}
