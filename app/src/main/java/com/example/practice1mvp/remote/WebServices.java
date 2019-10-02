package com.example.practice1mvp.remote;

import com.example.practice1mvp.usuario.model.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface WebServices {

    @GET("posts/")
    Call<List<User>> getUsers();
}
