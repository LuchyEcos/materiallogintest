package testSuit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import registerForm.HelloWorldScreen;
import registerForm.LoginScreen;
import registerForm.NewAccountScreen;
import session.Session;
public class SessionTest {
    LoginScreen loginScreen = new LoginScreen();
    HelloWorldScreen helloWorldScreen = new HelloWorldScreen();
    @Test
    public void LogIn() throws InterruptedException{
        String sendLoginEmail = "luchy.ecos@gmail.com";
        String sendLoginPass = "1234";
        loginScreen.addLoginEmail.setText(sendLoginEmail);
        loginScreen.addLoginPass.setText(sendLoginPass);
        loginScreen.btnLogin.click();
        Assertions.assertTrue(helloWorldScreen.helloWorldTitle.isControlDisplayed(),
                "ERROR");


        Thread.sleep(2000);
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }
}
