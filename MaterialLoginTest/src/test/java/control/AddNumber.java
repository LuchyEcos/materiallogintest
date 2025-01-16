package control;
import org.openqa.selenium.By;
public class AddNumber extends Control{
    public AddNumber(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }
}
