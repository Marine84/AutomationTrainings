package user.decorator;

import user.builder.User;
import org.testng.Reporter;
import user.IUser;

public class UserDecorator implements IUser {

    private User user;
    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public String getUsername() {
        Reporter.log("User is successfully found", user.getUsername() != null);
        return user.getUsername();
    }

    @Override
    public String getPassword() {
        Reporter.log("User is successfully found", user.getPassword() != null);
        return user.getPassword();
    }
}
