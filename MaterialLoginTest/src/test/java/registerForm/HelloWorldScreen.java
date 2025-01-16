package registerForm;

import control.*;
import org.openqa.selenium.By;

public class HelloWorldScreen {
    public HelloWorldTitle helloWorldTitle = new HelloWorldTitle(By.xpath("//android.widget.TextView[@text='Hello world!']"));

}
