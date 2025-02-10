package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.sql.SQLOutput;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://automationexercise.com/");
        driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();
        driver.findElement(By.cssSelector("input[data-qa=\"signup-name\"]")).sendKeys("yousef");
        driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]")).sendKeys("joe5.yousef@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]")).click();
        driver.findElement(By.cssSelector("input[data-qa=\"password\"]")).sendKeys("mynamesjoe");
        driver.findElement(By.cssSelector("input[data-qa=\"first_name\"]")).sendKeys("yousef");
        driver.findElement(By.cssSelector("input[data-qa=\"last_name\"]")).sendKeys("ashraf");
        driver.findElement(By.cssSelector("input[data-qa=\"address\"]")).sendKeys("tahrir");
        driver.findElement(By.cssSelector("input[data-qa=\"state\"]")).sendKeys("cairo");
        driver.findElement(By.cssSelector("input[data-qa=\"city\"]")).sendKeys("helwan");
        driver.findElement(By.cssSelector("input[data-qa=\"zipcode\"]")).sendKeys("+20");
        driver.findElement(By.cssSelector("input[data-qa=\"mobile_number\"]")).sendKeys("01124603272");
        driver.findElement(By.cssSelector("button[data-qa=\"create-account\"]")).click();
        driver.findElement(By.cssSelector("a[data-qa=\"continue-button\"]")).click();
        driver.findElement(By.cssSelector("a[href=\"/logout\"]")).click();
        driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]")).sendKeys("joe.yousef.ya@gmail.com");
        driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]")).sendKeys("mynamesjoe");
        driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]")).click();
        Select day = new Select(driver.findElement(By.cssSelector("select[data-qa=\"days\"]")));
        Select month = new Select(driver.findElement(By.cssSelector("select[data-qa=\"months\"]")));
        Select year = new Select(driver.findElement(By.cssSelector("select[data-qa=\"years\"]")));
                day.selectByIndex(2);
                month.deselectByValue("5");
                year.selectByVisibleText("1997");
          Select country = new Select(driver.findElement(By.cssSelector("select[data-qa=\"country\"]")));
                 country.deselectByValue("canda");







    }
}