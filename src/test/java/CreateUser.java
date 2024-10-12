import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateUser {
    @FindBy(xpath= "//a[contains(text(),'Register')]")
    WebElement btnRegister;
    @FindBy(className = "MuiInputBase-input")
    List<WebElement> inputField;

    @FindBy(css = "[type=radio]")
    List<WebElement> radioBtn;
    @FindBy(css = "[type=checkbox]")
    WebElement checkbox;
    @FindBy(className = "MuiButtonBase-root")
    WebElement btnRegistration;

    public CreateUser(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createUser(String firstName, String lastName, String Email, String password, String phoneNumber, String Address) throws InterruptedException {
        btnRegister.click();
        Thread.sleep(500);
        inputField.get(0).sendKeys(firstName);
        inputField.get(1).sendKeys(lastName);
        inputField.get(2).sendKeys(Email);
        inputField.get(3).sendKeys(password);
        inputField.get(4).sendKeys(phoneNumber);
        inputField.get(5).sendKeys(Address);
        radioBtn.get(0).click();
        checkbox.click();
        btnRegistration.click();

    }
}
