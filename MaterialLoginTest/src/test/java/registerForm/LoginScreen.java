package registerForm;

import control.AddAccount;
import control.AddLoginEmail;
import control.AddLoginPass;
import control.BtnLogin;
import org.openqa.selenium.By;

public class LoginScreen {

 public AddAccount addAccount = new AddAccount(By.xpath("//android.widget.TextView[@resource-id='com.sourcey.materialloginexample:id/link_signup']"));
 public AddLoginEmail addLoginEmail = new AddLoginEmail(By.id("com.sourcey.materialloginexample:id/input_email"));
 public AddLoginPass addLoginPass = new AddLoginPass(By.id("com.sourcey.materialloginexample:id/input_password"));
 public BtnLogin btnLogin = new BtnLogin(By.id("com.sourcey.materialloginexample:id/btn_login"));

}
