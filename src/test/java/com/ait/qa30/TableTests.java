package com.ait.qa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void findElementInTableTestsWithCss(){
        List<WebElement> tr = driver.findElements(By.cssSelector("tr"));
        System.out.println("Rows in table"+tr.size());
        System.out.println("********************************************");
        for (int i = 0; i < tr.size(); i++) {
            System.out.println(tr.get(i).getText());
            System.out.println("-------------------------------");
        }
        //numbers of columns
        List<WebElement> columns = driver.findElements(By.cssSelector("tr th"));
        System.out.println("columns in table"+columns.size());
        System.out.println("================================");

        List<WebElement> row2 = driver.findElements(By.cssSelector("#customers tr:nth-child(2) td"));   //  driver.findElements(By.xpath("//*[@id='customers']//tr//td"));
        for (WebElement element: row2){
            System.out.println(element.getText());
            System.out.println("========================");
        }

        //print last columns
        List<WebElement> lastColumns = driver.findElements(By.cssSelector("tr td:last-child")); //driver.findElements(By.xpath("//tr/td[last()]"));
        for (WebElement el : lastColumns){
            System.out.println(el.getText());
            System.out.println("///////////////////////////////////");
            System.out.println("********************************************");
        }

        //print column 3 row 4
                System.out.println(driver.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(3)")).getText());   //By.xpath("//tr[4]/td[3]");
                System.out.println(driver.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(3)")).getText());   //By.xpath("//td[contains(.,'Mexico")];




    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
