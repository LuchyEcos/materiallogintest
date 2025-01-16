package control;
import org.openqa.selenium.By;
public class AddRePass extends Control{
    public AddRePass(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }
}
