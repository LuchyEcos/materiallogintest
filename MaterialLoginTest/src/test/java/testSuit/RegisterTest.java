package testSuit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import registerForm.HelloWorldScreen;
import registerForm.LoginScreen;
import registerForm.NewAccountScreen;
import session.Session;
public class RegisterTest {
    LoginScreen loginScreen = new LoginScreen();
    NewAccountScreen newAccountScreen = new NewAccountScreen();
    HelloWorldScreen helloWorldScreen = new HelloWorldScreen();
    @Test
    public void createNewAccount() throws InterruptedException{
        String sendName = "Lucy";
        String sendAddress = "Calle Modesta Sanjinez";
        String sendEmil = "luchy.ecos@gmail.com";
        String sendNumber = "70624869";
        String sendPass = "1234";
    loginScreen.addAccount.click();
    newAccountScreen.addName.setText(sendName);
    newAccountScreen.addAddress.setText(sendAddress);
    newAccountScreen.addEmail.setText(sendEmil);
    newAccountScreen.addNumber.setText(sendNumber);
    newAccountScreen.addPass.setText(sendPass);
    newAccountScreen.addRePass.setText(sendPass);
    Assertions.assertTrue(newAccountScreen.createAccount.isControlDisplayed(),
                    "Buttom not displayed" );
    newAccountScreen.createAccount.click();
    Assertions.assertTrue(helloWorldScreen.helloWorldTitle.isControlDisplayed(),
            "ERROR");


        Thread.sleep(2000);
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }

}
