package com.MiniProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Minipro 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
        System.setProperty("webdriver.chrome.driver",
        		"C:\\Users\\Savitha\\eclipse-workspace\\Project\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://adactinhotelapp.com/");
        driver.manage().window().maximize();
        Robot r=new Robot();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        
        
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	    username.sendKeys("SavithaR");
	    
	    
	    WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	    pass.sendKeys("Adventure@2312");
	    
	    
	    WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
	    login.click();
	
	    
	    WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
	    Select s=new Select(loc);
	    s.selectByIndex(5);
	    Thread.sleep(3000);
	    
	    
	    WebElement hot = driver.findElement(By.xpath("//select[@id='hotels']"));
	    Select s1=new Select(hot);
	    s1.selectByValue("Hotel Sunshine");
	    Thread.sleep(3000);
	    
	    
	    WebElement roty = driver.findElement(By.xpath("//select[@id='room_type']"));
	    Select s2=new Select(roty);
	    s2.selectByVisibleText("Deluxe");
	    Thread.sleep(3000);
	    
	    
	    WebElement rono = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    Select s3=new Select(rono);
	    s3.selectByIndex(5);
	    Thread.sleep(3000);
	    
	    
	    WebElement cid = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	    cid.click();
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_X);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_X);
	    
	    cid.sendKeys("23/01/2000");
	    Thread.sleep(3000);
	    
	    
	    WebElement cod = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	    cod.click();
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_X);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_X);
	    
	    cod.sendKeys("25/01/2000");
	    Thread.sleep(3000);
	    
	    
	    WebElement apr = driver.findElement(By.xpath("//select[@id='adult_room']"));
	    Select s4=new Select(apr);
	    s4.selectByValue("2");
	    Thread.sleep(3000);
	    
	    
	    WebElement cpr = driver.findElement(By.xpath("//select[@id='child_room']"));
	    Select s5=new Select(cpr);
	    s5.selectByVisibleText("1 - One");
	    Thread.sleep(3000);
	    
	    
	    WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
	    search.click();
	    Thread.sleep(3000);
	    
	    
	    WebElement slt = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	    slt.click();
	    Thread.sleep(3000);
	    
	    
	    WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
	    con.click();
	    Thread.sleep(3000);
	    
	    
	    js.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    WebElement fstname = driver.findElement(By.xpath("//input[@id='first_name']"));
	    fstname.sendKeys("Priya");
	    Thread.sleep(3000);
	    
	    
	    WebElement lstname = driver.findElement(By.xpath("//input[@id='last_name']"));
	    lstname.sendKeys("Dharshini");
	    Thread.sleep(3000);
	    
	    
	    WebElement add = driver.findElement(By.xpath("//textarea[@id='address']"));
	    add.sendKeys("12/6, Bharathiyar Street, Ambattur, Chennai-600 078");
	    Thread.sleep(3000);
	    
	    
	    WebElement ccn = driver.findElement(By.xpath("//input[@id='cc_num']"));
	    ccn.sendKeys("7890324574893249");
	    Thread.sleep(3000);
	    
	    
	    WebElement cct = driver.findElement(By.xpath("//select[@id='cc_type']"));
	    Select s6=new Select(cct);
	    s6.selectByIndex(3);
	    Thread.sleep(3000);
	    
	    
	    WebElement edm = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	    Select s7=new Select(edm);
	    s7.selectByValue("12");
	    Thread.sleep(3000);
	    
	    
        WebElement edy = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	    Select s8=new Select(edy);
        s8.selectByVisibleText("2016");
	    Thread.sleep(3000);
	    
	    
	    WebElement cnv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	    cnv.sendKeys("1234");
	    Thread.sleep(3000);
	    
	    
	    WebElement bn = driver.findElement(By.xpath("//input[@id='book_now']"));
	    bn.click();
	    Thread.sleep(3000);
	    
	    
	    js.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    WebElement myiti = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
	    myiti.click();
	    Thread.sleep(3000);
	    
	    
	    WebElement can = driver.findElement(By.xpath("//input[@id='check_all']"));
	    can.click();
	    Thread.sleep(3000);
	    
	    
	    WebElement cansel = driver.findElement(By.xpath("//input[@name='cancelall']"));
	    cansel.click();
	    Thread.sleep(3000);
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		
		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		logout.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
