package registerForm;
import control.*;
import org.openqa.selenium.By;
public class NewAccountScreen {

    public AddName addName = new AddName(By.xpath("//android.widget.EditText[@resource-id='com.sourcey.materialloginexample:id/input_name']"));
    public AddAddress addAddress = new AddAddress(By.id("com.sourcey.materialloginexample:id/input_address"));
    public AddEmail addEmail = new AddEmail(By.id("com.sourcey.materialloginexample:id/input_email"));
    public AddNumber addNumber = new AddNumber(By.id("com.sourcey.materialloginexample:id/input_mobile"));
    public AddPass addPass = new AddPass(By.id("com.sourcey.materialloginexample:id/input_password"));
    public AddRePass addRePass = new AddRePass(By.id("com.sourcey.materialloginexample:id/input_reEnterPassword"));
    public CreateAccount createAccount = new CreateAccount(By.id("com.sourcey.materialloginexample:id/btn_signup"));



}
