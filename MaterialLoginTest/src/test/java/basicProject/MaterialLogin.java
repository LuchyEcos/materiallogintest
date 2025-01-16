package basicProject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class MaterialLogin {
    AppiumDriver mobile;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName","DIPLOMADO");
        config.setCapability("platformVersion","9.0");
        config.setCapability("appPackage","com.sourcey.materialloginexample");
        config.setCapability("appActivity","com.sourcey.materiallogindemo.LoginActivity");
        config.setCapability("platformName","Android");
        config.setCapability("automationName","uiautomator2");
        mobile = new AndroidDriver(new URL(" http://127.0.0.1:4723/wd/hub"),config);
        //esperas:
        //implicit / explicit / fluent
        mobile.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Test
    public void IngresApp()throws InterruptedException {
        String name = "Lucy";
        String address = "Calle Modesta Sanjinez";
        String email = "luchy.ecos@gmail.com";
        String number = "70624869";
        String pass = "1234";
        String passConfirmation = "1234";
    mobile.findElement(By.xpath("//android.widget.TextView[@resource-id='com.sourcey.materialloginexample:id/link_signup']")).click();
    mobile.findElement(By.xpath("//android.widget.EditText[@resource-id='com.sourcey.materialloginexample:id/input_name']")).sendKeys(name);
    mobile.findElement(By.id("com.sourcey.materialloginexample:id/input_address")).sendKeys(address);
    mobile.findElement(By.id("com.sourcey.materialloginexample:id/input_email")).sendKeys(email);
    mobile.findElement(By.id("com.sourcey.materialloginexample:id/input_mobile")).sendKeys(number);
    mobile.findElement(By.id("com.sourcey.materialloginexample:id/input_password")).sendKeys(pass);
    mobile.findElement(By.id("com.sourcey.materialloginexample:id/input_reEnterPassword")).sendKeys(passConfirmation);

    mobile.findElement(By.id("com.sourcey.materialloginexample:id/btn_signup")).click();
    }
}
