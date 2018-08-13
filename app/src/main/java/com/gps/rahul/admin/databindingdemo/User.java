package com.gps.rahul.admin.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable{
    private String name;
    private String email;

    public User() {
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //notifyPropertyChanged(com.gps.rahul.admin.databindingdemo.BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        //notifyPropertyChanged(com.gps.rahul.admin.databindingdemo.BR.email);
    }
}