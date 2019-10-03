package com.example.practice1mvp.usuario.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import com.example.practice1mvp.R;
import com.example.practice1mvp.usuario.interfaces.UserContract;
import com.example.practice1mvp.usuario.model.User;
import com.example.practice1mvp.usuario.presenter.UserPresenterImpl;
import java.util.List;


public class UserActivity extends AppCompatActivity implements UserContract.View {

    private UserPresenterImpl userPresenter;
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userPresenter = new UserPresenterImpl(this);
        userPresenter.start();
    }

    @Override
    public void init() {
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userPresenter.loadUsers();
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void loadDataInList(List<User> users) {
       adapter = new RecyclerAdapter(users);
       recyclerView.setAdapter(adapter);
    }
}
