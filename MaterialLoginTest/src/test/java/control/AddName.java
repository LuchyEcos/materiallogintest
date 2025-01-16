package control;
import org.openqa.selenium.By;
public class AddName extends Control{
    public AddName(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }

}
