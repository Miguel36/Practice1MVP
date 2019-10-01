package com.example.practice1mvp.usuario.interfaces;

import com.example.practice1mvp.usuario.model.User;

import java.util.List;

public interface UserContract {

    interface View{
        void init();
        void showError(String message);
        void loadDataInList(List<User> users);
    }

    interface Presenter{
        void start();
        void loadUsers();
    }
}
