/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webcalculator;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author john.arcy.r.teodoro
 */
public class OperationsSeleniumTest {
    
    @Test
    public void AdditionSeleniumtest() throws Exception {

        System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://localhost:8085/WebCalculator/index.htm");
        
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        String expectedResult = "5.0";

        driver.findElement(By.name("num1")).sendKeys("3");
        Thread.sleep(1000);
        
        driver.findElement(By.name("num2")).sendKeys("2");
        Thread.sleep(1000);
        
        Select operationSelect = new Select(driver.findElement(By.name("op")));
        
        operationSelect.selectByVisibleText("Add");
        Thread.sleep(1000);
        
        driver.findElement(By.name("submit")).submit(); 
        Thread.sleep(1000);
        
        String actualResult;
        actualResult = driver.findElement(By.name("result")).getAttribute("value");
        
        assertEquals(expectedResult,actualResult);
        Thread.sleep(1000);
        //Close the browser
        driver.quit();
    }
}
