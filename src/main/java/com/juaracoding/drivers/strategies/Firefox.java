//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public Firefox() {
    }

    public WebDriver setStrategy() {
        String path = "C:\\MyTools\\geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
