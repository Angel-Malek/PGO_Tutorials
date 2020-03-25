package com.company;

public class User {

    private String Name;
    private String LastName;
    private String Email;
    private String Password;
    boolean UserGuest;

    public User(String Name, String LastName, String Email, String Password) {
        this.Name = Name;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.UserGuest = false;
    }

    public User(String Email) {
        this.Email = Email;
        this.UserGuest = true;
        //this user us guest
    }

    public boolean UserGuest() {
        if (this.Email == Email) {
            return false;
        } else {
            return true;

        }
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public boolean isUserGuest() {
        return UserGuest;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setUserGuest(boolean userGuest) {
        UserGuest = userGuest;
    }
}



