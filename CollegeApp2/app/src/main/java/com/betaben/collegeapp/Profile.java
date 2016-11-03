package com.betaben.collegeapp;

/**
 * Created by Ben on 11/3/16.
 */

public class Profile {

    private String firstName = "";
    private String lastName = "";

    private String email = "";

    private String objectId = "";

    public Profile(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }




}
