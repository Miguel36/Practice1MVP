package com.example.practice1mvp.usuario.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practice1mvp.R;
import com.example.practice1mvp.usuario.model.User;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter {

    List<User> usersList;

    public RecyclerAdapter(List<User> userslist){
        this.usersList = userslist;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((RecyclerViewHolder) holder).binData(usersList.get(position));
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
