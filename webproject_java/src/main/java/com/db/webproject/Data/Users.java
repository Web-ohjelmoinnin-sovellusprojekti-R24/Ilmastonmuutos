package com.db.webproject.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;
    private String Username;
    private String Password;

    public Users() {
    }

    public Users(String Username, String Password) {
        //this.UserID = UserID;
        this.Username = Username;
        this.Password = Password;
    }

    public int getUserID() {
        return this.UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }


}
