package main.java.tasks.homework.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestWeather_HM {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.get("https://google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("погода Минск");
        element.submit();
        driver.findElement(By.xpath("//div[@id='wob_dp']/div[@data-wob-di='1']")).click();
        System.out.println(driver.findElement(By.xpath("//*[contains((@aria-label),'12:00') " +
                "and contains (@aria-label, 'Fahrenheit')][2]")).getAttribute("aria-label"));
    }
}
