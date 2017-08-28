package builder;


import user.IUser;

public class User implements IUser {
    private String userName;
    private String pass;

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return pass;
    }

    //Constructor for Builder pattern usage
    private User(UserBuilder builder) {
        this.userName = builder.userName;
        this.pass = builder.pass;
    }

    // Nested class has created to perform Builder pattern method
    public static class UserBuilder {
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
