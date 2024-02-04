package com.ait.qa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkLesson3 {
   WebDriver driver;

   @BeforeMethod
    public void setUp(){
       driver = new ChromeDriver();
       driver.get("https://demowebshop.tricentis.com/");
   }
   @Test
    public void findElementByCss(){
        driver.findElement(By.cssSelector("a.ico-login"));  //by tag className
        driver.findElement(By.cssSelector("#poll-voting-progress-1")); //by id
        driver.findElement(By.cssSelector(".bar-notification"));   //by className
        driver.findElement(By.cssSelector("a[href='/sitemap']")); //by tag , arrg
        driver.findElement(By.cssSelector("[title='Notification']")); //by arrg

   }

   @Test
   public void findElementByXpath(){
        driver.findElement(By.xpath("//*[@title='Notification']"));
        driver.findElement(By.xpath("//*[@id='poll-voting-progress-1']"));
        driver.findElement(By.xpath("//div[@class='header-logo']"));
        driver.findElement(By.xpath("//*[text()='Do you like nopCommerce?']"));


   }

   @AfterMethod
    public void tearDown(){

       System.out.println("bye bye!!!");
       driver.quit();
   }

}
