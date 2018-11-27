package br.com.marsket.model;

import br.com.marsket.util.UserTypeEnum;

public class User {

    private String username;
    private String password;
    private UserTypeEnum userType;

    public User(String username, String password, UserTypeEnum userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passworld) {
        this.password = passworld;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", userType=" + userType + '}';
    }

}
