package com.example.practice1mvp.usuario.presenter;

import com.example.practice1mvp.remote.UserRepository;
import com.example.practice1mvp.usuario.interfaces.UserContract;
import com.example.practice1mvp.usuario.model.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class UserPresenterImpl implements UserContract.Presenter {

    private UserContract.View mView;
    private UserRepository userRepository;

    public UserPresenterImpl(UserContract.View mView){
        userRepository = UserRepository.getInstance();
        this.mView = mView;
    }


    @Override
    public void loadUsers() {
        userRepository.getUsersInfo(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> users = response.body();
                mView.loadDataInList(users);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                mView.showError(t.getMessage());
            }
        });
    }


    @Override
    public void start() {
        mView.init();
    }
}
