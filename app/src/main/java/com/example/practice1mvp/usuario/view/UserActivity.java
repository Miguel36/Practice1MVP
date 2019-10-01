package com.example.practice1mvp.usuario.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.practice1mvp.R;
import com.example.practice1mvp.usuario.interfaces.UserContract;
import com.example.practice1mvp.usuario.model.User;
import com.example.practice1mvp.usuario.presenter.UserPresenterImpl;
import java.util.List;


public class UserActivity extends AppCompatActivity implements UserContract.View {

    private UserPresenterImpl userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userPresenter = new UserPresenterImpl(this);
        userPresenter.start();
    }

    @Override
    public void init() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void loadDataInList(List<User> users) {

    }
}
