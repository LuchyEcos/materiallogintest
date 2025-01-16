package control;
import org.openqa.selenium.By;
public class AddEmail extends Control{
    public AddEmail(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }
}
