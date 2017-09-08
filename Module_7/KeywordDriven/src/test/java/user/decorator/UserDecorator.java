package user.decorator;

import user.builder.User;
import org.testng.Reporter;
import user.IUser;

public class UserDecorator implements IUser {

    private IUser user;
    public UserDecorator(IUser user) {
        this.user = user;
    }

    @Override
    public String getUsername() {
        Reporter.log("UserName is successfully found", user.getUsername() != null);
        return user.getUsername();
    }

    @Override
    public String getPassword() {
        Reporter.log("Password is successfully found", user.getPassword() != null);
        return user.getPassword();
    }
}
