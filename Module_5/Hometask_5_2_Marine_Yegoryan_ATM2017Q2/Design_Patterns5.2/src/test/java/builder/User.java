package builder;

public class User {
    private  String userName;
    private  String pass;

    //Constructor for Decorator pattern usage
    public User() {
    }

    public User(User user) {
        this.userName = user.getUsername();
        this.pass = user.getPassword();
    }

    //Constructor for Builder pattern usage
    private User(UserBuilder builder) {
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
    private static class UserBuilder {
        private  String userName;
        private  String pass;
        private  String address;

        public UserBuilder(String userName, String pass) {
            this.userName = userName;
            this.pass = pass;
        }

        public UserBuilder (String address){
            this.address = address;
        }

        public User build() {
            return new User(this);
        }
    }

}
