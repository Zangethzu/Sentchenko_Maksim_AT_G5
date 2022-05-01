package main.java.tasks.homework.booking;

import java.util.concurrent.TimeUnit;

public class Hotels {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.booking.com/");

        WebElement elementField = driver.findElement(By.name("ss"));
        elementField.sendKeys("Париж");
        driver.findElement(By.xpath("//span[text()='Париж']")).click();

        driver.findElement(By.xpath("//span[@aria-label='3 Май 2022']")).click();
        driver.findElement(By.xpath("//span[@aria-label='10 Май 2022']")).click();

        driver.findElement(By.xpath("//label[@id='xp__guests__toggle']")).click();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--secondary bui-stepper__add-button '][1]")).click();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--secondary bui-stepper__add-button '][1]")).click();
        driver.findElement(By.xpath("//button[@aria-label='Номера: увеличить количество']")).click();
        driver.findElement(By.xpath("//div[@class='xp__button']")).click();
        driver.findElement(By.xpath("//div[contains")).click();
    }


}
}
