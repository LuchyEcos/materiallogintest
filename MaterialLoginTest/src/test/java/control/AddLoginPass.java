package control;
import org.openqa.selenium.By;
public class AddLoginPass extends Control{
    public AddLoginPass(By locator){super(locator);}
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }
}
