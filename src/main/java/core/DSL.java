package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DSL {

    public static final int DEFAULT_WAIT_TIME = 10;

    public WebDriver getDriver(){
        return DriverFactory.getDriver();

    }

    public WebElement getElement(By by){
        return getDriver().findElement(by);
    }

    public WebElement getElement(String id){
        return getElement(By.id(id));
    }

    public void write(String id, String text){
        write(By.id(id),text);
    }

    public void write(WebElement element, String text){
        element.sendKeys(text);
    }

    public void write(By by, String text){
        getElement(by).clear();
        getElement(by).sendKeys(text);
    }

    public String getTextValue(String id){
        return getTextValue(By.id(id));
    }

    public String getTextValue(By by){
        return getElement(by).getText();
    }

    public void clickButton(String id){
        clickButton(By.id(id));
    }

    public void clickButton(By by){
        getElement(by).click();
    }

    public void clickButton(WebElement element){
        element.click();
    }

    public void clickLink (By by){
        getElement(by).click();
    }

    public void clickWebElement (WebElement element){
        element.click();
    }

    public void clickRadio(String id){
        clickRadio(By.id(id));
    }

    public void clickRadio (By by){
        getElement(by).click();
    }

    public void selectComboOption (WebElement element, String text){
        Select combo = new Select(element);
        combo.selectByVisibleText(text);
    }

    public String getPageTitle() {
        return getDriver().getTitle();
    }

    public String getPageUrl(){
        return getDriver().getCurrentUrl();
    }

    public void closeBrowser() {
        getDriver().close();
    }

    public void quitBrowser() {
        getDriver().quit();
    }

    public void visible(WebElement element) {
        element.isDisplayed();
    }

    public void fillStringInput(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    public void wait (WebElement element, int amountOfTimeInSeconds){
        WebDriverWait wait = new WebDriverWait(this.getDriver(), amountOfTimeInSeconds);
        wait.until((ExpectedConditions.visibilityOf(element)));
    }

    public void wait (WebElement element){
        wait(element, DEFAULT_WAIT_TIME);
    }
}

