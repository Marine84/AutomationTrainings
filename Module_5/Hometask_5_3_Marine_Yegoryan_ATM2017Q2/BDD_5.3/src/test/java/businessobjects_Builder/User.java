package businessobjects_Builder;

public class User {
    private final String userName;
    private final String pass;

    //Constructor for Decorator pattern usage
    public User(String user, String pass) {
        this.userName = user;
        this.pass = pass;
    }

    //Constructor for Builder pattern usage
    public User(UserBuilder builder) {
        this.userName = builder.userName;
        this.pass = builder.pass;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return pass;
    }

    // Nested class has created to perform Builder pattern method
    public static class UserBuilder {
        private final String userName;
        private final String pass;

        public UserBuilder(String userName, String pass) {
            this.userName = userName;
            this.pass = pass;
        }

        public User build() {
            return new User(this);
        }
    }

}
