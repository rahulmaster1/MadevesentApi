package com.zcorp.medversant.api.web.response;

import java.util.List;

import com.zcorp.medversant.api.model.User;

public class UserResponse {
    private Boolean status; 
    private String message; 
    private String data;  


    public Boolean isStatus() {
        return this.status;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String string) {
        this.data = string;
    }

    public UserResponse() {

    }
}
