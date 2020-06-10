package com.androiddev.mobile_ws.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

    @NotNull(message = "First name should not be null")
    @Size(min = 2, message = "First name not must be less than 2 characters")
    private String firstName;

    @NotNull(message = "Last name should not be null")
    @Size(min = 2, message = "Last name not must be less than 2 characters")
    private String lastName;

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

}
