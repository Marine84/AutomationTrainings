package business_objects;

public class User {
    private String user;
    public User(String user){
        this.user = user;
    }
    public String getUsername(){
       return user;
    }
}
