package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPages {
    WebDriver driver;
    public registerPages(WebDriver driver){
        this.driver = driver;
    }

    //Locator dari register nama
    By firstnameField = By.id("customer.firstName");
    By lastnameField = By.id("customer.lastName");

    //Metode input nama
    public void inputNameData(String firstname, String lastname){
        driver.findElement(firstnameField).sendKeys(firstname);
        driver.findElement(lastnameField).sendKeys(lastname);
    }
}
