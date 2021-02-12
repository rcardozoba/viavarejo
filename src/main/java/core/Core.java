package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class Core {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public Core(){
        this.driver = getDriver();

    }

    public static void closeDriver() {
        killDriver();
    }
}
