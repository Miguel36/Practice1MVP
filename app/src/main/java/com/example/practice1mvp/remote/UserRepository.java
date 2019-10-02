package com.example.practice1mvp.remote;

import com.example.practice1mvp.usuario.model.User;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserRepository {

    private static UserRepository userRepository;
    private WebServices service;
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static UserRepository getInstance(){
        if (userRepository == null){
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    public UserRepository(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(WebServices.class);
    }

    public void getUsersInfo(Callback<List<User>> callback){
        service.getUsers().enqueue(callback);
    }
}
