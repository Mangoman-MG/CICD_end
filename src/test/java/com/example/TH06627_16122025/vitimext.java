package com.example.TH06627_16122025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class vitimext {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vitimex.com.vn/");
    }
    @Test
    public void timkiem() throws InterruptedException {
        driver.findElement(By.className("h-search")).click();
        driver.findElement(By.id("inputSearchAuto")).sendKeys("Vest");
        driver.findElement(By.id("search-header-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h3[.//a[.='QUẦN VEST VITIMEX DÁNG ÔM VỪA SLIMFIT TRƠN QVS 5001']]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btn-addtocart")).click();
        driver.findElement(By.xpath("//div[.//label[text()='34']]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[.//a[text()='THÊM VÀO GIỎ HÀNG']]")).click();
        Thread.sleep(10000);

    }
    @AfterClass
    public void end(){
        driver.quit();
    }
}
