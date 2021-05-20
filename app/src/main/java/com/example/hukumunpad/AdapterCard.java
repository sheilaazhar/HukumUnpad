package com.example.hukumunpad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.MyHolder> {

    private Context context;
    private List<MyModel> list;
    private View view;

    public AdapterCard(Context context, List<MyModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterCard.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCard.MyHolder holder, int position) {
        MyModel model = list.get(position);

        Glide.with(context).load(model.getUrlImage()).into(holder.imageHeader);
        holder.textTitle.setText(model.getTitle());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, model.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imageHeader;
        TextView textTitle;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageHeader = itemView.findViewById(R.id.image_header);
            textTitle = itemView.findViewById(R.id.title_card);
        }
    }
}
