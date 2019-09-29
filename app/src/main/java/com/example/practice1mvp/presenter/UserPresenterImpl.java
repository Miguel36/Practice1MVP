package com.example.practice1mvp.presenter;

import com.example.practice1mvp.interfaces.UserContract;

public class UserPresenterImpl implements UserContract.Presenter {

    private UserContract.View mView;

    public UserPresenterImpl(UserContract.View mView){
        this.mView = mView;
    }

    @Override
    public void start() {

    }

    @Override
    public void loadUsers() {

    }
}
