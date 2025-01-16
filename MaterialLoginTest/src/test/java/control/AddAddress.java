package control;
import org.openqa.selenium.By;
public class AddAddress extends Control{
    public AddAddress(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }
}
