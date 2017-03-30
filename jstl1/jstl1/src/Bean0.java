public class Bean0 {
    String username;
    String password;
    public Bean0() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public String getHiddenPassword() {
        String temp = "";
        for (int i = 0; i < password.length(); i++) {
            temp += "*";
        }
        return temp;
    }
}
