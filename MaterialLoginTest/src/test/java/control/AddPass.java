package control;
import org.openqa.selenium.By;
public class AddPass extends Control{
    public AddPass(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }
}
