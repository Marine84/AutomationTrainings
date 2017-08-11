package decorator;

import businessobjects_Builder.User;
import org.testng.Reporter;

public class UserDecorator extends User {
    public UserDecorator(String user, String pass) {
        super(user, pass);
    }

    @Override
    public String getUsername() {
        Reporter.log("User is successfully found", super.getUsername() != null);
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        Reporter.log("User is successfully found", super.getPassword() != null);
        return super.getPassword();
    }
}
