/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webcalculator;

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

        WebDriver driver = new FirefoxDriver();

        driver.get("http://localhost:8085/WebCalculator/index.htm");
        
        String expectedResult = "5";

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getTitle().contains("NetBeans");
            }
        });

        driver.findElement(By.name("num1")).sendKeys("3");
        driver.findElement(By.name("num2")).sendKeys("2");
        
        Select operationSelect = new Select(driver.findElement(By.name("op")));
        
        operationSelect.selectByValue("Add");
        
        driver.findElement(By.name("submit")).submit();
        
        String actualResult;
        actualResult = driver.findElement(By.name("result")).toString();
        
        assertEquals(actualResult,expectedResult);
        
        //Close the browser
        //driver.quit();
    }
    
}
