package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class SselniumTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }

}
