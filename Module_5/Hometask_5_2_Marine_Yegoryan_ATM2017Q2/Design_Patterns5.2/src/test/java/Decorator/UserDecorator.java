package decorator;

import builder.User;
import org.testng.Reporter;

public class UserDecorator extends User {

    private User user;
    public UserDecorator(User user) {
       this.user = user;
    }

    @Override
    public String getUsername() {
        Reporter.log("User is successfully found", super.getUsername() != null);
        return user.getUsername();
    }

    @Override
    public String getPassword() {
        Reporter.log("User is successfully found", super.getPassword() != null);
        return user.getPassword();
    }
}
