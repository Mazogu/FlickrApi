package com.example.micha.flickrmvp.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.micha.flickrmvp.R;
import com.example.micha.flickrmvp.detail.DetailActivity;
import com.example.micha.flickrmvp.model.Picture.Photo;
import com.example.micha.flickrmvp.model.SimplePhoto;

import java.util.List;

/**
 * Created by micha on 2/12/2018.
 */

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoHolder> {

    public static final String TAG = PhotoAdapter.class.getSimpleName();
    private List<SimplePhoto> list;
    private Context context;

    public PhotoAdapter(List<SimplePhoto> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public PhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_view, parent, false);
        return new PhotoHolder(view);
    }

    @Override
    public void onBindViewHolder(PhotoHolder holder, final int position) {
        Glide.with(context).load(list.get(position).getUrl()).into(holder.image);
        holder.text.setText(list.get(position).getTitle());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), DetailActivity.class);
                intent.setAction("Detail");
                intent.putExtra("title",list.get(position).getTitle());
                intent.putExtra("description",list.get(position).getDescription());
                intent.putExtra("owner",list.get(position).getOwner());
                intent.putExtra("date",list.get(position).getDate());
                intent.putExtra("url",list.get(position).getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PhotoHolder extends RecyclerView.ViewHolder{
        public final ImageView image;
        public final TextView text;
        public PhotoHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.picture);
            text = itemView.findViewById(R.id.test);
        }
    }
}
