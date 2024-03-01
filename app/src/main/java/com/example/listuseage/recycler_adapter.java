package com.example.listuseage;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.viewholer> {

    @NonNull
    @Override
    public viewholer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholer holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewholer extends RecyclerView.ViewHolder{

        public viewholer(@NonNull View itemView) {
            super(itemView);
        }
    }
}
