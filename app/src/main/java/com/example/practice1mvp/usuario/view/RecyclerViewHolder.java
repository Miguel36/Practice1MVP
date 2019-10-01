package com.example.practice1mvp.usuario.view;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.practice1mvp.R;
import com.example.practice1mvp.usuario.model.User;

import java.util.List;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView idTextView, titleTextView, bodyTextView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        idTextView = itemView.findViewById(R.id.user_id);
        titleTextView = itemView.findViewById(R.id.user_title);
        bodyTextView = itemView.findViewById(R.id.user_body);
    }

    public void binData(User user) {
        idTextView.setText(user.getId());
        titleTextView.setText(user.getTitle());
        bodyTextView.setText(user.getBody());
    }
}
