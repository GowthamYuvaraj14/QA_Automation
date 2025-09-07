package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ChadhavaPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Update these locators to match actual page HTML
    private By chadhavaMenu = By.id("chadhavaMenu");
    private By sevaSelect = By.id("sevaSelect");
    private By datePicker = By.id("datePicker");
    private By amountField = By.id("amount");
    private By proceedBtn = By.id("proceedBtn");
    private By errorMsg = By.id("errorMsg");

    public ChadhavaPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openChadhava() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chadhavaMenu));
        driver.findElement(chadhavaMenu).click();
    }

    public void selectSeva(String seva) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sevaSelect));
        driver.findElement(sevaSelect).sendKeys(seva);
    }

    public void pickDate(String date) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(datePicker));
        driver.findElement(datePicker).sendKeys(date);
    }

    public void enterAmount(String amt) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(amountField));
        driver.findElement(amountField).sendKeys(amt);
    }

    public void clickProceed() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedBtn));
        driver.findElement(proceedBtn).click();
    }

    public String getError() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
        return driver.findElement(errorMsg).getText();
    }
}
