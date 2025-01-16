package control;
import org.openqa.selenium.By;
public class AddLoginEmail extends Control{
    public AddLoginEmail(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }

}
